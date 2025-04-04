public class area{
public static void main(String[] args){
arw ob = new arw();
ob.setlen(12);
ob.setbre(10);
System.out.println("area "+(ob.getlen()*ob.getbre()));
}
}
class arw{
private int len;
private int bre;
public void setlen(int ns){
len =ns;
}
public void setbre(int ns){
bre =  ns;
}
public int getlen(){
return len;
}
public int getbre(){
return bre;
}
}