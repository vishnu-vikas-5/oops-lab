public class bank {
    public int getbalance(){
        return 0;
    }
    public static void main(String[] args) {
        bank n=new banka();
        bankb b=new bankb();
        n.getbalance();
        b.getbalance();
    }
}
class banka extends bank{
    public int getbalance(){
        System.out.println(1500);
        return 1500;
    }
}
class bankb extends bank{
    public int getbalance() {
        System.out.println(20000);
        return 20000;
    }
}