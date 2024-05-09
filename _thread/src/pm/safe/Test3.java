package pm.safe;

public class Test3 {
    public static void main(String[] args) {
        // lock 锁，手动上锁，手动释放锁
         MyRunnable2 mr2 = new MyRunnable2();

        Thread t1 = new Thread(mr2, "窗口1");
        Thread t2 = new Thread(mr2, "窗口2");
        Thread t3 = new Thread(mr2, "窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
