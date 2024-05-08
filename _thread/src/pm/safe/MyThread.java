package pm.safe;

public class MyThread extends Thread {
    // 表示这个类所有的对象，都共享 ticket 数据
    static int ticker = 0;

    // 锁对象，一定要是唯一的, 加上 static 关键字在这个类里就是唯一的
    static final Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            // 同步代码块
            synchronized (MyThread.class) {
                if (ticker < 100) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ticker++;
                    System.out.println(getName() + "正在卖第" + ticker + "张票");
                } else {
                    break;
                }
            }
        }
    }
}
