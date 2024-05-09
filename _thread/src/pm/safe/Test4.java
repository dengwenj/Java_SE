package pm.safe;

public class Test4 {
    public static void main(String[] args) {
        Thread t1 = new DeadLock();
        Thread t2 = new DeadLock();

        t1.setName("线程A");
        t2.setName("线程B");
        t1.start();
        t2.start();
    }
}
