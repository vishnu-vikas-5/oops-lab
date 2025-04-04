// Define a class named 'Person'
class Person {
    // Instance variables
    String name;
    int age;

    // Constructor with parameters
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display the person's details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Create an object of the Person class using the constructor
        Person person1 = new Person("Alice", 30);

        // Display the details of the person
        person1.displayDetails();
    }
}