package pm.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test1 {
    public static void main(String[] args) {
        // 1、创建线程池
        // ExecutorService executorService = Executors.newCachedThreadPool(); // 没有上限的
        ExecutorService executorService = Executors.newFixedThreadPool(3); // 有上限的，3个线程

        MyRunnable t1 = new MyRunnable();
        MyRunnable t2 = new MyRunnable();
        MyRunnable t3 = new MyRunnable();
        // 执行任务
        executorService.submit(t1);
        executorService.submit(t2);
        executorService.submit(t3);

        // 销毁线程池(一般不销毁)
        // executorService.shutdown();
    }
}
