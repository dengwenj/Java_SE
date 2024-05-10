package pm.anli.demo4;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {
    // 共享的数据，红包的个数
    private static int redNum = 3;
    // 💰也是共享数据
    private static double money = 100;
    // 共用一把锁🔐
    private static final Lock l = new ReentrantLock();

    private static final Random r = new Random();

    // 作为线程的状态, 这个不是共用的，每个对象都有
    private volatile boolean running = true;

    @Override
    public void run() {
        while (true) {
            try {
                l.lock(); // 上锁
                // 说明红包没有了
                if (redNum <= 0) {
                    // 说明没有进到过抢红包环节
                    if (running) {
                        System.out.println(getName() + " -> 没有抢到红包");
                    }
                    break;
                } else {
                    // 抢到的人不能再抢了
                    if (!running) {
                        return;
                    }

                    double v;
                    // 如果是最后一个红包了就不需要随机了
                    if (redNum == 1) {
                        v = money;
                    } else {
                        // 系统取 0.01 到剩余平均值 * 2之间作为红包的金额
                        v = r.nextDouble(((money / redNum)) * 2) + 0.01;
                        // 保留 2 为小数
                        v = Double.parseDouble(String.format("%.2f", v));
                    }
                    // 剩余的钱
                    money -= v;
                    money = Double.parseDouble(String.format("%.2f", money));
                    // 剩余的红包个数
                    redNum--;
                    // 抢到的人不能再抢了 停止线程
                    stopThread();
                    System.out.println(getName() + "抢到了 " + v + " 元");
                } 
            } finally {
                l.unlock(); // 释放锁 无论如何都会走当这里，即使 return 了
            }
        }
    }

    public void stopThread() {
        running = false;
    }
}
