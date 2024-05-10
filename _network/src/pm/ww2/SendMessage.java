package pm.ww2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;

public class SendMessage {
    public static void main(String[] args) throws IOException {
        // 组播，发送数据

        // 创建对象
        MulticastSocket ms = new MulticastSocket();

        // 数据打包
        String str = "朴睦24";
        byte[] bytes = str.getBytes();
        InetAddress address = InetAddress.getByName("224.0.0.1");
        int port = 1209;
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);

        // 发送数据
        ms.send(dp);

        // 释放资源
        ms.close();
    }
}
