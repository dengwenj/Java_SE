package pm.method;

public class Test2 {
    public static void main(String[] args) {
        // 守护线程

        MyThread1 mt1 = new MyThread1();
        MyThread2 mt2 = new MyThread2();

        mt1.setName("女神");
        mt2.setName("备胎");

        // 开启守护线程
        mt2.setDaemon(true);

        mt1.start();
        mt2.start();
    }
}
