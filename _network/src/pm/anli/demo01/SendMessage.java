package pm.anli.demo01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class SendMessage {
    public static void main(String[] args) throws IOException {
        // 聊天室
        // UDP 发送数据：数据来自于键盘录入，直到输入的数据是 886，发送数据结束
        // UDP 接收数据：因为接收端不知道发送端什么时候停止发送，故采用死循环接收

        // 发送端
        DatagramSocket ds = new DatagramSocket();

        // 数据打包
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入内容：");
            String s = sc.nextLine();

            if ("886".equals(s)) {
                break;
            }

            byte[] bytes = s.getBytes();
            InetAddress address = InetAddress.getByName("127.0.0.1");
            int port = 1209;
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);

            // 发送数据
            ds.send(dp);
        }

        // 释放资源
        ds.close();
    }
}
