import pc.CarException;
import pc.car;

public class App9 {
    public static void main(String[] args) throws Exception {
        car car1 = new car();   
        try{
            car1.setcar(124, -10.0);
        }
        catch(CarException e){
            System.out.println("©ß¥X"+e+"¤F");
        }
        car1.show();
    }
}
