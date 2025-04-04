public class encap{
public static void main(String[] args){
cdd obj = new cdd();
obj.setroll(51);
obj.setname("vishnu vikas");
obj.setage(18);
System.out.println("name:"+obj.getname());
System.out.println("age:"+obj.getage());
System.out.println("roll no:"+obj.getroll());


}
}
class cdd{
private int age;
private String name;
private int roll;
public void setroll(int ns){
roll = ns;
}
public void setname(String ns){
name = ns;
}
public void setage(int ns){
age = ns;
}
public int getroll(){
return roll;
}
public int getage(){
return age;
}
public String getname(){
return name;
}
}