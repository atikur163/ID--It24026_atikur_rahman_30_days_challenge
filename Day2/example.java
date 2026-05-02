// The Class 
class Animal {
    String name; // Property

    void eat() { // Method
        System.out.println(name + " is eating.");
    }
}

//Inheritance 
class Dog extends Animal {
    void bark() {
        System.out.println(name + " says: Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        // The Object 
        Dog myDog = new Dog();
        myDog.name = "Buddy"; // Assigning a unique property
        
        myDog.eat();  // Inherited method
        myDog.bark(); // Specific method
    }
}
