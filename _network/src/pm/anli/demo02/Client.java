package pm.anli.demo02;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        // 多发多收
        // 客户端：多次发送数据
        // 服务端：多次接收数据，并打印

        // 创建对象
        Socket s = new Socket("127.0.0.1", 1209);

        OutputStream outputStream = s.getOutputStream();
        Scanner sc = new Scanner(System.in);

        // 发送数据
        while (true) {
            System.out.println("请输入数据");
            String s1 = sc.nextLine();
            if ("886".equals(s1)) {
                break;
            }

            outputStream.write(s1.getBytes());
        }

        // 关闭通道
        s.close();
    }
}
