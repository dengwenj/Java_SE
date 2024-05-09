package pm.anli.demo1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {
    private static int num = 0;
    // 共用一个锁
    private static final Lock l =  new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            try {
                // 手动加上锁
                l.lock();
                if (num == 1000) {
                    break;
                } else {
                    Thread.sleep(10);
                    // 卖票
                    num++;
                    System.out.println(getName() + "正在卖" + num + "张票");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                // 释放锁
                l.unlock();
            }
        }
    }
}
