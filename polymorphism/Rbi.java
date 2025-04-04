import java.util.Scanner;
public class Rbi {
int minbal=2000;
void minbalance(){
System.out.println("the min bal is "+minbal);}
void minwidthdraw(){}
public static void main(String[] args){
Rbi rbi=new Rbi();
SBI sbi=new SBI();
PNB pnb=new PNB();
account c=new account();
c.acc();
Scanner s =new Scanner(System.in);
System.out.print("select bank:");
String sb=s.nextLine();
sb.toLowerCase();
if (sb.equals("rbi")){
rbi.minbalance();
}
else if (sb.equals("sbi")){
sbi.minbalance();
}
else if (sb.equals("pnb")){
pnb.minbalance();
}
}
} 
class SBI extends Rbi{
void minbalance(){
minbal=1500;
System.out.println("the min bal is "+minbal);
}
}
class PNB extends Rbi{
void minbalance(){
minbal=1000;
System.out.println("the min bal is "+minbal);
}
}
class customer extends Rbi{
void cus(){
Scanner in =new Scanner(System.in);
System.out.print("enter your name:");
String name=in.nextLine();
}
}
class account extends customer{
void acc(){
Scanner n=new Scanner(System.in);
System.out.print("enter your ACC NO:");
int accno=n.nextInt();
super.cus();
}
}
