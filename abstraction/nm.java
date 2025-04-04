public class nm {
    public static void main(String[] args) {
        bb nnn=new bb();
        nnn.bk();
    }
}
abstract class neww{
    abstract void bk();
}
class bb extends neww {
    void bk(){
        System.out.println("the content is abstracted");
    }
}