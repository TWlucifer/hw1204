public class App16 {
    public static void main(String[] args)  {
        car car1 = new car("1號車");
        car1.start();  
        car car2 = new car("2號車");
        car2.start();  
        for(int i = 0;i<5;i++){
            System.out.println("進行main()工作");
        }
    }
}
/**
 * car
 */
class car extends Thread{
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