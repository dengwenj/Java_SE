package pm.anli.demo05;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(1209);

        // 用线程池
        ThreadPoolExecutor pools = new ThreadPoolExecutor(
          3,
          16,
          60,
            TimeUnit.SECONDS,
            new ArrayBlockingQueue<>(2),
            Executors.defaultThreadFactory(),
            new ThreadPoolExecutor.AbortPolicy()
        );

        while (true) {
            // 等待客户端连接
            Socket accept = ss.accept();

            // new Thread(new MyRunnable(accept)).start();
            pools.submit(new MyRunnable(accept));
        }
    }
}
