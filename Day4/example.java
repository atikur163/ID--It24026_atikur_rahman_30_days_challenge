public class Student {
    // Encapsulation
    // Private
    private String studentName;
    // Constructor
    public Student(String name) {
        this.studentName = name;
    }
    // Public
    // This allows easy updates and retrieval without affecting other parts
    public String getName() {
        return studentName;
    }
}
