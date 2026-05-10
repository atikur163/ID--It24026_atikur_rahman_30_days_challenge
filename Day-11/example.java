import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListComparison {
    public static void main(String[] args) {
        
        List<String> fastAccessList = new ArrayList<>();
        fastAccessList.add("Element 0");
        fastAccessList.add("Element 1");
        fastAccessList.add("Element 2");
      
        String item = fastAccessList.get(1); 
        System.out.println("ArrayList quick access at index 1: " + item);

        fastAccessList.add(1, "New Element"); 

        LinkedList<String> fastModificationList = new LinkedList<>();
        fastModificationList.add("Task A");
        fastModificationList.add("Task B");
        fastModificationList.add("Task C");

        fastModificationList.addFirst("Priority Task");
        fastModificationList.remove(2); // Efficient if you are already at that node

        String task = fastModificationList.get(2); 
        System.out.println("LinkedList slow access (traversal required): " + task);

        System.out.println("\nFinal ArrayList: " + fastAccessList);
        System.out.println("Final LinkedList: " + fastModificationList);
    }
}
