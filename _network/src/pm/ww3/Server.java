package pm.ww3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        // 创建服务端 Socket 对象
        ServerSocket ss = new ServerSocket(1209);

        // 监听客户端连接，连接上才会走下面
        Socket accept = ss.accept();

        // 获取数据
        InputStream inputStream = accept.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));

//        String s;
//        while ((s = br.readLine()) != null) {
//            System.out.println(s);
//        }

//        int read;
//        while ((read = br.read()) != -1) {
//            System.out.println((char) read);
//        }

        char[] chars = new char[1024];
        int len;
        while ((len = br.read(chars)) != -1) {
            System.out.println(new String(chars, 0, len));
        }
        // 释放资源
        br.close();
        ss.close();
    }
}
