import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        //  HASHMAP: Fast Access & Unordered ---
        Map<String, Double> inventory = new HashMap<>();
        
        inventory.put("Laptop", 999.99);
        inventory.put("Smartphone", 599.49);
        inventory.put("Tablet", 299.00);
        
        // Application: Quick Lookup
        String searchProduct = "Laptop";
        System.out.println("--- HashMap: Inventory Lookup ---");
        if (inventory.containsKey(searchProduct)) {
            System.out.println("Price of " + searchProduct + ": $" + inventory.get(searchProduct));
        }
        -   //  TREEMAP: Sorted by Key & Red-Black Tree ---
        TreeMap<Integer, String> studentGrades = new TreeMap<>();
        
        studentGrades.put(95, "Alice");
        studentGrades.put(72, "Bob");
        studentGrades.put(88, "Charlie");
        studentGrades.put(91, "Diana");

        System.out.println("\n--- TreeMap: Students Sorted by Score (Key) ---");
        // TreeMap automatically sorts by the key (Integer score in this case)
        System.out.println(studentGrades);

        // Application: Range Query (Unique to TreeMap/NavigableMap)
        System.out.println("\n--- TreeMap: Range Query (Scores 85 to 100) ---");
        Map<Integer, String> highAchievers = studentGrades.subMap(85, 101);
        System.out.println("Students in 85-100 range: " + highAchievers);
        ---
        // COUNTING ITEMS (HashMap Application) ---
        String text = "apple banana apple cherry banana apple";
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : text.split(" ")) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        System.out.println("\n--- HashMap: Item Counting ---");
        System.out.println("Word frequencies: " + wordCount);
    }
}
