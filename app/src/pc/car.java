package pc;

public class car {
    private int num;
    private double gas;

    public car(){
        num = 0;
        gas = 0.0;
        System.out.println("�w�Ͳ��T��");
    }

    public void setcar(int n, double g) throws CarException {
        if (g < 0) {
            throw new CarException();
        } else {
            num = n;
            gas = g;
            System.out.println("�N�����]��" + num + "�T�o���]��" + gas);
        }
    }

    public void show(){
        System.out.println("�����O" + num);
        System.out.println("�T�o�q�O" + gas);
    }
}
