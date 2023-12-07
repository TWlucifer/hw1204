package pc;

public class car {
    private int num;
    private double gas;

    public car(){
        num = 0;
        gas = 0.0;
        System.out.println("已生產汽車");
    }

    public void setcar(int n, double g) throws CarException {
        if (g < 0) {
            throw new CarException();
        } else {
            num = n;
            gas = g;
            System.out.println("將車號設為" + num + "汽油輛設為" + gas);
        }
    }

    public void show(){
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
    }
}
