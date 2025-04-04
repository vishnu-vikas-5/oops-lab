import java.util.Scanner;
public class Polyw {

    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        hlo ob = new bye();
        ob.area(a , b);
    }

}
class hlo{
    int x=2;
    int y=2;
    int z=2;

     void area(int x,int y){
        System.out.println(9*y);
    }
   void area(int x,int y,int z){
         int vol=x*y*z;
        System.out.println(vol);
    }
}
class bye extends hlo{

    void area(int x, int y) {
        System.out.println(8*y);
    }
    void area(int x, int y, int z) {

    }
}