package pm.safe;

public class MyRunnable implements Runnable {
    private int ticker = 0;

    @Override
    public void run() {
//        for (int i = 0; i < 100; i++) {
//            while (true) {
//                // sleep不会释放锁，但是会让出cpu执行权
//                synchronized (MyRunnable.class) {
//                    if (ticker < 100) {
//                        try {
//                            Thread.sleep(10);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                        ticker++;
//                        System.out.println(Thread.currentThread().getName() + "正在卖第" + ticker + "张票");
//                    } else {
//                        break;
//                    }
//                }
//            }
//        }

        for (int i = 0; i < 100; i++) {
            while (true) {
                if (syncMethod()) {
                    break;
                }
            }
        }
    }

    // 同步方法
    public synchronized boolean syncMethod() {
        if (ticker < 100) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ticker++;
            System.out.println(Thread.currentThread().getName() + "正在卖第" + ticker + "张票");
            return false;
        }
        return true;
    }
}
