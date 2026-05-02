// Superclass 
class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound");
    }
}
// Subclass 
class Dog extends Animal {
    // This is Method Overriding
    @Override
    void makeSound() {
        System.out.println("The dog barks: Woof Woof!");
    }
}
public class Main {
    public static void main(String[] args) {
        // We use a superclass reference (Animal) to point to a subclass object (Dog).
        Animal myPet = new Dog();
        myPet.makeSound(); 
    }
}
