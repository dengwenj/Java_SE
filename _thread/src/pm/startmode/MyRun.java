package pm.startmode;

public class MyRun implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            // 获取当前运行的线程
            Thread thread = Thread.currentThread();
            System.out.println(thread.getName() + "多线程");
        }
    }
}
