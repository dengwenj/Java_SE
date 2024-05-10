package pm.anli.demo4;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread2 extends Thread {
    // 共享的数据，红包的个数
    private static int redNum = 3;
    // 💰也是共享数据
    private static double money = 100;
    // 共用一把锁🔐
    private static final Lock l = new ReentrantLock();
    // 最小红包
    static final double MIN = 0.01;

    private static final Random r = new Random();

    @Override
    public void run() {
        // 每人只抢一次所以不用循环

        l.lock();
        // 说明红包抢完了
        if (redNum == 0) {
            System.out.println(getName() + "没抢到红包");
        } else {
            // 抢红包
            double v;
            // 最后一个红包
            if (redNum == 1) {
                v = money;
            } else {
                // 不是最后一个红包
                v = r.nextDouble(money - ((redNum - 1) * MIN)); // 0 - ...
                v = Double.parseDouble(String.format("%.2f", v));
                // 说明比 0.01 小
                if (v < MIN) {
                    v = MIN;
                }
            }
            // 剩余的钱
            money -= v;
            money = Double.parseDouble(String.format("%.2f", money));
            // 红包个数-1
            redNum--;
            System.out.println(getName() + "抢到了 " + v + " 元");
        }
        l.unlock();
    }
}
