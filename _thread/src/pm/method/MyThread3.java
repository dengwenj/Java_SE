package pm.method;

public class MyThread3 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i + "-" + getName());
            // 出让当前 CPU 的执行权，尽可能让他们更均匀一点
            Thread.yield();
        }
    }
}
