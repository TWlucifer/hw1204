import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class App12 {
    public static void main(String[] args) throws Exception {
       try{
        FileWriter fw= new FileWriter("text.txt");
        PrintWriter pw = new PrintWriter(new BufferedWriter(fw));

        pw.println("hello");
        pw.println("goodbye");

        pw.close();
        System.out.println("��ƥH�g�J�ɮ�");
       }
       catch(IOException e){
            System.out.println("��J���~");
       }
    }
}
