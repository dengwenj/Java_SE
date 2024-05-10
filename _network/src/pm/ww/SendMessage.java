package pm.ww;

import java.io.IOException;
import java.net.*;

public class SendMessage {
    public static void main(String[] args) throws IOException {
        // 发送数据 UDP

        // 创建 DatagramSocket 对象
        // 细节：
        // 绑定端口，以后我们就是通过这个端口往外发送
        // 空参：所有可用的端口中随机一个进行使用
        // 有参：指定端口号进行绑定
        DatagramSocket datagramSocket = new DatagramSocket();

        // 打包数据
        String str = "你好，朴睦";
        byte[] bytes = str.getBytes();
        // 需要发到哪台电脑
        //InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
        // 广播只需要改成 255.255.255.255 就行了
        InetAddress inetAddress = InetAddress.getByName("255.255.255.255");
        int port = 1209;
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, inetAddress, port);

        // 发送数据
        datagramSocket.send(datagramPacket);

        // 释放资源
        datagramSocket.close();
    }
}
