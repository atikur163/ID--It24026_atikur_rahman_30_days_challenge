public class Car {
    String model;
    int year;
    //  No-argConstructor
    public Car() {
        model = "Unknown";
        year = 2024;
    }
    //  Parameterized Constructor
    public Car(String carModel, int carYear) {
        this.model = carModel;
        this.year = carYear;
    }
    public void displayInfo() {
        System.out.println("Car: " + model + " | Year: " + year);
    }
    public static void main(String[] args) {
        // Using the no-arg constructor
        Car defaultCar = new Car();
        // Using the parameterized constructor for meaningful initialization
        Car myCar = new Car("Tesla", 2026);
        defaultCar.displayInfo(); // Output: Car: Unknown | Year: 2024
        myCar.displayInfo();      // Output: Car: Tesla | Year: 2026
    }
}
