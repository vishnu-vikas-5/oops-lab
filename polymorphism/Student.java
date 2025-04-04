public class Student {
    private String name;
    private int age;
    private String course;

    // Default constructor
    public Student() {
        this.name = "Unknown";
        this.age = 0;
        this.course = "Not enrolled";
    }

    // Constructor with one parameter
    public Student(String name) {
        this.name = name;
        this.age = 0;
        this.course = "Not enrolled";
    }

    // Constructor with two parameters
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.course = "Not enrolled";
    }

    // Constructor with three parameters
    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Method to display student details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        Student student1 = new Student();
        Student student2 = new Student("Alice");
        Student student3 = new Student("Bob", 20);
        Student student4 = new Student("Charlie", 22, "Computer Science");

        // Displaying student details
        student1.display();
        student2.display();
        student3.display();
        student4.display();
    }
}