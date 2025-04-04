import java.util.Scanner;
class shape{
    int length,breath,height;
    void length(int length){
    this.length=length;
    }
    void breath(int breath){
        this.breath=breath;
    }
    void height(int height){
        this.height=height;
    }
}
class area extends shape{
    void area(){
        int area =length*breath;
        System.out.println("the area of the given parameter is:"+area);
    }
}
class volume extends shape{
    void volume(){
        int vol=length*breath*height;
        System.out.println("the volume of the given parameter is:"+vol);
    }
}

public class mains {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.println("enter length:");
        int l=inp.nextInt();
        System.out.println("enter breath:");
        int b=inp.nextInt();
        System.out.println("enter height:");
        int h=inp.nextInt();
        area a=new area();
        volume v=new volume();
        a.length(l);
        a.breath(b);
        a.area();
        v.height(h);
        v.breath(b);
        v.length(l);
        v.volume();
    }
}
