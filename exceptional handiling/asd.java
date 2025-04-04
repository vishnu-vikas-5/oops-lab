import java.util.*;
public class asd {
    public static void main(String[] args) {
        detal n= new detal();
        n.mm();
    }
}
class detal{
    void mm(){
        try{
        Scanner inp= new Scanner(System.in);
        System.out.println("enter your age");
        int age=inp.nextInt();
        if (age<1){
            throw new Exception("age should be more than 1");
        }
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("the programm has ended sucessfully");
        }
    }
}