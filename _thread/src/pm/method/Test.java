package pm.method;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        t1.start();
        MyThread t2 = new MyThread();
        t2.start();

        System.out.println("111111");
        Thread.sleep(3000);
        System.out.println("22222");
    }
}
