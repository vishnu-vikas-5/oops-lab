

public class ec200 {
    int a;
    int b;

    // Constructor must be public
    public ec200(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // getmax() must also be public
    public void getmax() {
        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else {
            System.out.println(b + " is greater than " + a);
        }
    }

    public static void main(String[] args) {
        ec200 obj = new ec200(2, 3);
        obj.getmax();
    }
}
