public class A {
    static void mani(){
        System.out.println("parent");
    }
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        A ab=new B();
        a.mani();
        b.mani();
        ab.mani();
    }
}
class B extends A{
    static void mani(){
        System.out.println("child");
    }
}
