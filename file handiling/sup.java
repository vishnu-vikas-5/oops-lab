import java.io.BufferedReader;
import java.io.FileReader;

import java.util.ArrayList;


public class sup {
    public static void main(String[] args) {
        ArrayList<String> arr =new ArrayList<>();

        try {
            FileReader fr = new FileReader("output.txt");
            BufferedReader br = new BufferedReader(fr);
            String v= br.readLine();

            int a=0;
            while (v!=null){
                System.out.println(v);
                arr.add(v);
                v= br.readLine();
                a+=1;
                System.out.println(a);
            }
        }
        catch (Exception e){
            System.out.println("error occured");
        }
        System.out.println(arr);

    }
}
