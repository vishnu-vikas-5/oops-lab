import java.util.Scanner;
public class bse {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("+,- select any one");
        String gett=input.nextLine();
        if(gett.equals("+")){
            disp v=new add();
            v.calc();
        } else if (gett.equals("-")) {
            disp n=new sub();
            n.calc();
        }
    }
}
abstract class disp{
    protected int a,b;
    protected Scanner input=new Scanner(System.in);
    abstract void calc();
}
class add extends disp{
    void calc(){
        System.out.print("enter number 1:");
        a=input.nextInt();
        System.out.print("enter number 2:");
        b=input.nextInt();
        System.out.println("the sum of "+a+" and "+b+" is "+(a+b));
    }
}
class sub extends disp{
    void calc(){
        System.out.print("enter number 1:");
        a=input.nextInt();
        System.out.print("enter number 2:");
        b=input.nextInt();
        System.out.println("the difference is "+(a-b));
    }
}
