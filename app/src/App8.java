public class App8 {
    public static void main(String[] args) throws Exception {
        try{
            int[] test;
            test = new int[5];

            System.out.println("�N�ȫ��w��test[10]");

            test[10] = 80;

            System.out.println("�N80���w��test[10]");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("�W�X�d��");
            System.out.println("�o��"+e+"���N�~");
        }
        finally{
            System.out.println("�̫����");
        }
        System.out.println("���槹��");
    }
}
