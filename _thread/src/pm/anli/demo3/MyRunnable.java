package pm.anli.demo3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyRunnable implements Runnable {
    // 共用的数据
    private static int num = 1;
    // 他们共用一把锁
    private static final Lock l = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            try {
                // 锁上
                l.lock();
                if (num >= 100) {
                    break;
                } else {
                    // 奇数
                    if (num % 2 != 0) {
                        System.out.println(Thread.currentThread().getName() + " -> 正在获取的奇数是：" + num);
                    }
                    num++;
                }
            } finally {
                // 释放锁
                l.unlock();
            }
        }
    }
}
