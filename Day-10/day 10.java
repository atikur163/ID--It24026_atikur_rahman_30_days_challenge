import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("Java"); // Duplicate allowed
        System.out.println("ArrayList (Ordered): " + arrayList);

        List<String> linkedList = new LinkedList<>();
        linkedList.add("Fast");
        linkedList.add("Flexible");
        System.out.println("LinkedList: " + linkedList);

        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Apple"); // Duplicate ignored
        hashSet.add(null);    // Null allowed
        System.out.println("HashSet (Unordered/Unique): " + hashSet);

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(50);
        treeSet.add(10);
        treeSet.add(30);
        // treeSet.add(null);
        System.out.println("TreeSet (Sorted): " + treeSet);

        // HashMap: No guaranteed order, allows null key/values
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Entry One");
        hashMap.put(2, "Entry Two");
        hashMap.put(null, "Null Key"); // Null allowed
        System.out.println("HashMap (Key-Value): " + hashMap);

        // TreeMap: Keys are kept in sorted order
        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("Zebra", "Stripes");
        treeMap.put("Apple", "Fruit");
        treeMap.put("Mango", "Fruit");
        System.out.println("TreeMap (Sorted by Key): " + treeMap);
    }
}
