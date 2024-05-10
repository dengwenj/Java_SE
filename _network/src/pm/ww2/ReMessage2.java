package pm.ww2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;

public class ReMessage2 {
    public static void main(String[] args) throws IOException {
        // 接收数据
        MulticastSocket ms = new MulticastSocket(1209);

        // 接收的地址
        InetAddress address = InetAddress.getByName("224.0.0.1");
        ms.joinGroup(address);

        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
        ms.receive(dp);

        // 解析数据包
        int port = dp.getPort();
        byte[] data = dp.getData();
        int length = dp.getLength();
        String str = new String(data, 0, length);
        String hostName = dp.getAddress().getHostName();
        String hostAddress = dp.getAddress().getHostAddress();

        System.out.println("数据是：" + str + "地址是：" + hostAddress + "名称是：" + hostName + "端口是：" + port);
    }
}
