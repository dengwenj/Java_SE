package pm.putandtake;

import java.util.concurrent.ArrayBlockingQueue;

public class Test {
    public static void main(String[] args) {
        // 利用阻塞队列完成生产者和消费者（等待唤醒机制）的代码
        // 细节：生产者和消费者必须使用同一个阻塞队列

        // 创建阻塞队列的对象（共用同一个）
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1);

        Foodie f = new Foodie(queue);
        Cook c = new Cook(queue);

        f.start();
        c.start();
    }
}
