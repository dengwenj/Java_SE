package pm.waitandnotfiy;

public class Cook extends Thread {
    @Override
    public void run() {
        while (true) {
            synchronized (Desk.obj) {
                if (Desk.count == 0) {
                    break;
                } else {
                    // 桌上没有面条
                    if (Desk.foodFlag == 0) {
                        // 开始做
                        System.out.println(getName() + "正在做面条");
                        // 有面条
                        Desk.foodFlag = 1;
                        // 唤醒其他线程
                        Desk.obj.notifyAll();
                    } else {
                        // 有面条
                        try {
                            // 等待
                            Desk.obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
