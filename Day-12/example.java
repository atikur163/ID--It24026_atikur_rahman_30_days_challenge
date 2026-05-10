import java.util.*;

public class SetComparison {
    public static void main(String[] args) {
        
        Set<String> guestList = new HashSet<>();
        
        guestList.add("Alice");
        guestList.add("Bob");
        guestList.add("Charlie");
        guestList.add("Alice"); // DUPLICATE: Will be ignored silently.
        
        System.out.println("--- HashSet: Guest List (No Duplicates, No Order) ---");
        System.out.println(guestList); 
      
        Set<Integer> highScores = new TreeSet<>();
        
        highScores.add(850);
        highScores.add(1200);
        highScores.add(450);
        highScores.add(1200); // DUPLICATE: Only one 1200 will be kept.
        
        System.out.println("\n--- TreeSet: Leaderboard (Automatically Sorted) ---");
        System.out.println(highScores); 
       
        List<String> rawData = Arrays.asList("Red", "Blue", "Red", "Green", "Blue");
        Set<String> uniqueColors = new HashSet<>(rawData);
        
        System.out.println("\n--- Practical: Data Cleaning ---");
        System.out.println("Original List: " + rawData);
        System.out.println("Cleaned Set: " + uniqueColors);
    }
}
