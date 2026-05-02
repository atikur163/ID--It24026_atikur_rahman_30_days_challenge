interface Calculator {
    void calculate(int a, int b);
}

class Addition implements Calculator {
    public void calculate(int a, int b) {
        System.out.println("Result: " + (a + b));
    }
}

class Multiplication implements Calculator {
    public void calculate(int a, int b) {
        System.out.println("Result: " + (a * b));
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator add = new Addition();
        Calculator multiply = new Multiplication();

        add.calculate(10, 5);
        multiply.calculate(10, 5);
    }
}
