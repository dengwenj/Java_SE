package pm.anli.demo03;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        // 客户端：发送一条数据，接收服务端反馈的消息并打印
        // 服务器：接收数据并打印，再给客户端反馈消息
        Socket s = new Socket("127.0.0.1", 1209);

        // 给服务端发送数据
        OutputStream outputStream = s.getOutputStream();

        String str = "见到你很开心";
        outputStream.write(str.getBytes());

        // 写一个结束标记
        s.shutdownOutput();

        // 收到服务端的数据
        InputStream inputStream = s.getInputStream();
        InputStreamReader isr = new InputStreamReader(inputStream);

        int i;
        while ((i = isr.read()) != -1) {
            System.out.print((char) i);
        }

        // 释放资源
        s.close();
    }
}
