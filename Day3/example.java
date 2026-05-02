abstract class Vehicle {
    public final String brand = "Global Motors";
    public static int totalObjects = 0;
    Vehicle() {
        totalObjects++;
    }
    abstract void drive();
}
class Car extends Vehicle {
    String model;
    Car(String model) {
        this.model = model;
    }
    void drive() {
        System.out.println(brand + " " + model + " is in motion.");
   }
}
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Sport");
        myCar.drive();
        System.out.println("Objects created: " + Vehicle.totalObjects);
    }
}
