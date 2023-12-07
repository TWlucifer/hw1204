public class App8 {
    public static void main(String[] args) throws Exception {
        try{
            int[] test;
            test = new int[5];

            System.out.println("將值指定給test[10]");

            test[10] = 80;

            System.out.println("將80指定給test[10]");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("超出範圍");
            System.out.println("發生"+e+"的意外");
        }
        finally{
            System.out.println("最後執行");
        }
        System.out.println("執行完畢");
    }
}
