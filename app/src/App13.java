import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class App13  {
    public static void main(String[] args) throws Exception {
       try{
        BufferedReader br = new BufferedReader(new FileReader("text.txt"));

        String st1 = br.readLine();
        String st2 = br.readLine();
        System.out.println("寫入的字串為");
        System.out.println(st1);
        System.out.println(st2);

        br.close();
       }
       catch(IOException e){
            System.out.println("輸入有誤");
       }
    }
}
