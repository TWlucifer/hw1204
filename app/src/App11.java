import pc.CarException;
import pc.car;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App11 {
    public static void main(String[] args) throws Exception {
       System.out.println("��J�r��");

       try{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println("��J�r�ꬰ"+str);
       }
       catch(IOException e){
            System.out.println("��J���~");
       }
    }
}
