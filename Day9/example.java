// Outer class
class University {
    String name = "Global Tech University";
    static String motto = "Innovation First";

    // 1. NON-STATIC INNER CLASS
    // Can access both static and non-static members of outer class
    class Department {
        void display() {
            System.out.println("Inner Class: Welcome to " + name); 
        }
    }

    // 2. STATIC NESTED CLASS
    // Cannot access non-static members (like 'name') directly
    static class Campus {
        void display() {
            System.out.println("Static Nested Class: Motto is " + motto);
        }
    }

    void openEvent() {
        // 3. METHOD-LOCAL INNER CLASS
        // Defined inside a method; only exists within this scope
        class Event {
            void announce() {
                System.out.println("Method-Local Class: Event started!");
            }
        }
        Event myEvent = new Event();
        myEvent.announce();
    }
}

// Interface for the Anonymous Inner Class example
interface Greeting {
    void sayHello();
}

public class Main {
    public static void main(String[] args) {
        
        // --- Instance creation for Non-Static Inner Class ---
        // Requires instance of Outer Class first
        University myUni = new University();
        University.Department myDept = myUni.new Department();
        myDept.display();

        // --- Instance creation for Static Nested Class ---
        // Does NOT require an instance of the Outer Class
        University.Campus myCampus = new University.Campus();
        myCampus.display();

        // --- Calling Method-Local Class ---
        myUni.openEvent();

        // 4. ANONYMOUS INNER CLASS
        // Used to instantiate a class/interface without a name for one-time use
        Greeting morningGreeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Anonymous Class: Good Morning!");
            }
        };
        morningGreeting.sayHello();
    }
}
