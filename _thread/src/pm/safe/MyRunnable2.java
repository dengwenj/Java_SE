package pm.safe;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyRunnable2 implements Runnable {
    // 共享
    private int ticker = 0;
    private final Lock l = new ReentrantLock();

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            while (true) {
                // 手动上锁
                l.lock();
                try {
                    if (ticker == 100) {
                        break;
                    } else {
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        ticker++;
                        System.out.println(Thread.currentThread().getName() + "正在卖第" + ticker + "张票");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    // 手动释放锁
                    l.unlock();
                }
            }
        }
    }
}
