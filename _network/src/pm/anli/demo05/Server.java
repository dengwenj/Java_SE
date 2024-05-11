package pm.anli.demo05;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(1209);

        while (true) {
            // 等待客户端连接
            Socket accept = ss.accept();

            new Thread(new MyRunnable(accept)).start();
        }
    }
}
