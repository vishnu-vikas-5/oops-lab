import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;
public class hj {
    public static void main(String[] args) {
       Scanner inp = new Scanner(System.in);
        System.out.println("how many name you want to enter:");
        int aa=inp.nextInt();
        inp.nextLine();
        String[] arr = new String[aa];
       for (int i=0;i<aa;i++){
           System.out.println("enter name "+(i+1)+":");
           String nam=inp.nextLine();
           arr[i]=nam;
       }
       try {
           FileWriter fw = new FileWriter("output.txt",true);
           BufferedWriter bw = new BufferedWriter(fw);
            for (int j=0;j<aa;j++){
                bw.newLine();
                bw.write(arr[j]);
            }
            bw.close();
           System.out.println("ArrayList successfully written to file!");
       }
      catch (Exception e){
          System.out.println("error");

      }

        System.out.println(Arrays.asList(arr));
    }
}
