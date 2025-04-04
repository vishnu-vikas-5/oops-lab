import java.util.*;
public class qww {
    public static void main(String[] args) {
        division n= new division();
        n.add();
    }
}
class diviexp extends Exception{
    diviexp(String s){
        super(s);
    }
}
class division{
    int a,b;
    void add(){
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("enter no 1:");
            a = in.nextInt();
            System.out.println("enter no 2:");
            b = in.nextInt();
            if(b==0){
                throw new diviexp("number cannot divide by 0");
            }
        }
        catch (diviexp e){
            System.out.println(e);
        }
        finally {
            System.out.println("programm completed ");
        }
    }
}