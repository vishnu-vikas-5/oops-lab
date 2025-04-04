import java.util.Scanner;
public class sss{
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.print("Are you student or teacher");
        String nam=inp.nextLine();
        nam=nam.toLowerCase();
        System.out.print("enter your user name:");
        String nam1=inp.nextLine();
        if (nam.equals("student")){
            en obj=new student(nam1);
            obj.display();
        } else if (nam.equals("teacher")) {
            en obj=new teacher(nam1);
            obj.display();
        }
    }
}
abstract class en{
    abstract void display();
}
class student extends en{
    String a;
    student(String a){
        this.a=a;
    }
    void display(){
        System.out.println("hello student "+a);
    }
}
class teacher extends en{
    String a;
    teacher(String a){
        this.a=a;
    }
    void display(){
        System.out.println("hello teacher "+a);
    }
}