import java.util.Scanner;
public class getdet{
public static void main(String[] args){
Scanner inp = new Scanner(System.in);
System.out.print("enter username:");
String usr=inp.nextLine();
System.out.print("enter email:");
String mail=inp.nextLine();
System.out.print("enter password:");
String pss=inp.nextLine();
det obj = new det();
obj.setuser(usr);
obj.setemail(mail);
obj.setpass(pss);
System.out.println(obj.getuser());
System.out.println(obj.getemail());
System.out.println(obj.getpass());
}
}
class det{
private String user;
private String email;
private String pass;

public void setuser(String ns){
user=ns;
}
public void setemail(String ns){
email=ns;
}
public void setpass(String ns){
pass=ns;
}
public String getuser(){
return user;
}
public String getemail(){
return email;
}
public String getpass(){
return pass;
}
}

