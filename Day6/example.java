
// Base class (Superclass)
class GameCharacter {
    String name;
    int health = 100;
    void move() {
        System.out.println(name + " is moving across the screen.");
    }
    // Method 
    void attack() {
        System.out.println(name + " performs a basic attack!");
    }
}
//  (Subclass)
class Warrior extends GameCharacter {
    Warrior(String name) {
        this.name = name;
    }

    // Method Overriding
    @Override
    void attack() {
        System.out.println(name + " swings a massive sword for 20 damage!");
    }
}

// Another specialized Data Model
class Mage extends GameCharacter {
    Mage(String name) {
        this.name = name;
    }

    @Override
    void attack() {
        System.out.println(name + " casts a fireball for 50 damage!");
    }
}
public class Main {
    public static void main(String[] args) {
        // Creating objects based on the hierarchy
        Warrior player1 = new Warrior("Aragon");
        Mage player2 = new Mage("Gandalf");
        player1.move();
        player2.move();
      
        player1.attack();
        player2.attack();
    }
}
