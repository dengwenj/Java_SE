package pm.pool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test2 {
    public static void main(String[] args) {
        // 自定义线程池
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
            3, // 核心线程数
            6, // 最大线程数
            60, // 空闲线程最多存活时间
            TimeUnit.SECONDS, // 时间单位 秒
            new ArrayBlockingQueue(3), // 任务队列，队列最长为3
            Executors.defaultThreadFactory(), // 创建线程工厂
            new ThreadPoolExecutor.AbortPolicy() // 任务的拒绝策略，静态内部类
        );

        // 执行任务
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
    }
}
