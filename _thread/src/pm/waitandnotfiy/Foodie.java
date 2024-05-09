package pm.waitandnotfiy;

public class Foodie extends Thread {
    @Override
    public void run() {
        while (true) {
            synchronized (Desk.obj) {
                // 说明吃了十碗面条
                if (Desk.count == 0) {
                    break;
                } else {
                    // 说明还有的吃
                    // 判断桌子上是否有面条
                    if (Desk.foodFlag == 0) {
                        // 没有面条，等待
                        try {
                            // 让当前线程跟锁进行绑定
                            Desk.obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        // 有面条
                        // 碗数 -1
                        Desk.count--;
                        // 吃
                        System.out.println("消费者正在吃第"+ Desk.count +"碗面条");
                        // 唤醒厨师继续做面条
                        Desk.obj.notifyAll();
                        // 修改桌子状态
                        Desk.foodFlag = 0;
                    }
                }
            }
        }
    }
}
