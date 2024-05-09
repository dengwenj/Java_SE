package pm.safe;

public class DeadLock extends Thread {
    private final Object obj1 = new Object();
    private final Object obj2 = new Object();

    @Override
    public void run() {
        if ("线程A".equals(getName())) {
            synchronized (obj1) {
                System.out.println(getName());
                System.out.println("1111");
                synchronized (obj2) {
                    System.out.println("2222");
                }
            }
        } else if ("线程B".equals(getName())) {
            synchronized (obj2) {
                System.out.println(getName());
                System.out.println("3333");
                synchronized (obj1) {
                    System.out.println("4444");
                }
            }
        }
    }
}
