public class App20{
    public static void main(String[] args)  {
        car car1 = new car("1號車");

        Thread th1 = new Thread(car1);

        th1.start();   
        for(int i = 0;i<5;i++){
           System.out.println("正在進行main()");
        }
        
    }

}
/**
 * car
 */
class car implements Runnable{
    private String name;

    public car(String nm){
        name = nm;
    }
    
    public void run(){
        for(int i = 0;i<5;i++){
            System.out.println("正在進行"+name+"的處理工作");
        }
    }
}