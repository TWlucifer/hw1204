public class App16 {
    public static void main(String[] args)  {
        car car1 = new car("1����");
        car1.start();  
        car car2 = new car("2����");
        car2.start();  
        for(int i = 0;i<5;i++){
            System.out.println("�i��main()�u�@");
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
            System.out.println("���b�i��"+name+"���B�z�u�@");
        }
    }
}