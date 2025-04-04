

public class tryt {
    public static void main(String[] args) {
        int a1 = 10, b2 = 10;
        ec200 bb = new ec200(a1, b2);
        
        if (a1 != b2) {
            bb.getmax();
        } else {
            System.out.println("Both are the same");
        }
    }
}
