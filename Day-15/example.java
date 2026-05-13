import java.util.*;

public class CollectionsRecap {

    public static void main(String[] args) {
        System.out.println("--- Java Collections Framework Recap --- \n");

        runLibrarySystem();
        runEcommerceSystem();
        runEmployeeSystem();
        runTaskManagement();
        runSocialMediaApp();
    }

    //ArrayList: Library Management
    public static void runLibrarySystem() {
        List<String> books = new ArrayList<>();
        books.add("The Great Gatsby");
        books.add("1984");
        books.add("Clean Code");
        
        System.out.println("[Library] Books added dynamically:");
        System.out.println("Inventory: " + books + "\n");
    }

    //HashMap: E-commerce Orders
    public static void runEcommerceSystem() {
        Map<Integer, String> orders = new HashMap<>();
        orders.put(1001, "Laptop");
        orders.put(1002, "Smartphone");
        
        System.out.println("[E-commerce] Retrieval by ID:");
        System.out.println("Order 1002: " + orders.get(1002) + "\n");
    }

    //HashSet: Employee Management
    public static void runEmployeeSystem() {
        Set<String> employees = new HashSet<>();
        employees.add("Alice");
        employees.add("Bob");
        employees.add("Alice"); // Duplicate

        System.out.println("[Employee] Unique names only:");
        System.out.println("Staff List: " + employees + "\n");
    }

    //LinkedList: Task Management
    public static void runTaskManagement() {
        LinkedList<String> tasks = new LinkedList<>();
        tasks.add("Write Code");
        tasks.addFirst("Priority: Fix Server");
        tasks.addLast("Submit Report");

        System.out.println("[Tasks] Efficient addition/removal:");
        System.out.println("Current Queue: " + tasks + "\n");
    }

    //HashMap + HashSet: Social Media
    public static void runSocialMediaApp() {
        Map<String, Set<String>> followers = new HashMap<>();
        followers.put("UserA", new HashSet<>(Arrays.asList("Alice", "Bob")));
        
        //Add a duplicate follower to UserA
        followers.get("UserA").add("Alice");

        System.out.println("[Social Media] Fast lookups & No duplicates:");
        System.out.println("UserA's Followers: " + followers.get("UserA"));
    }
}
