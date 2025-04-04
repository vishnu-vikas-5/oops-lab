import java.util.*;
public class Main{
    public static void main(String[] args) {


    arthematic n= new arthematic();
    n.add();
    }
}
class arthematic{
    int a,b;
    void add(){
        try{
            Scanner inp= new Scanner(System.in);
            System.out.print("enter number 1:");
            int a=inp.nextInt();
            System.out.print("enter number 2:");
            int b= inp.nextInt();
            System.out.println(a/b);
        }
        catch (InputMismatchException e){
            System.out.println("error occured");
        }
    }
}