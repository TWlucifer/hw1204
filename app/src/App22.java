public class App22{
    public static void main(String[] args)  {
        company cmp = new company();

        driver drv1 = new driver(cmp);
        drv1.start();
        
        driver drv2 = new driver(cmp);
        drv2.start();
    }

}
/**
 * car
 */
class company {
    private int sum = 0;

    public synchronized void add(int a){
        int tmp = sum;
        System.out.println("目前合計金額是"+tmp);
        System.out.println("賺"+a);
        tmp = tmp + a;
        System.out.println("合計是"+tmp);
        sum = tmp;
    }
}
/**
 * driver
 */
class driver extends Thread{
    private company comp;
    public driver(company c){
        comp = c;
    }
    public void run(){
        for(int i = 0;i<3;i++){
            comp.add(50);
        }
    }
    
}