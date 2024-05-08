package pm.method;

// 守护线程
public class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i + "-" + getName());
        }
    }
}
