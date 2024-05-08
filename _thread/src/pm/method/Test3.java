package pm.method;

public class Test3 {
    public static void main(String[] args) {
        MyThread3 mt3 = new MyThread3();
        MyThread3 mt4 = new MyThread3();

        mt3.setName("mt3");
        mt4.setName("mt4");

        mt3.start();
        mt4.start();
    }
}
