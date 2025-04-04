public class OverloadExample {

    // Method with one integer parameter
    public void display(int a) {
        System.out.println("Argument: " + a);
    }

    // Method with two integer parameters
    public void display(int a, int b) {
        System.out.println("Arguments: " + a + " and " + b);
    }

    // Method with one double parameter
    public void display(double a) {
        System.out.println("Argument: " + a);
    }

    public static void main(String[] args) {
        OverloadExample obj = new OverloadExample();

        // Calling the method with different parameters
        obj.display(5);
        obj.display(5, 10);
        obj.display(5.5);
    }
}