import java.io.FileReader;
import java.io.BufferedReader;
public class Main{
    public static void main(String[] args) {
        try{
        FileReader fr = new FileReader("output.txt");
        BufferedReader br=new BufferedReader(fr);
            String v= br.readLine();
            while (v!=null){
                System.out.println(v);
                v= br.readLine();
            }


            System.out.println("succes");
    }
    catch (Exception e){
        System.out.println("error occured");
    }
    }
}
