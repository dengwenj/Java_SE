package pm.anli.demo01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveMessage {
    public static void main(String[] args) throws IOException {
        // 接收数据
        // 创建对象
        DatagramSocket ds = new DatagramSocket(1209);

        // 接收包
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

        while (true) {
            ds.receive(dp);

            // 解析数据包
            byte[] data = dp.getData();
            int length = dp.getLength();
            int port = dp.getPort();
            // 主机名
            String hostName = dp.getAddress().getHostName();
            // 主机地址
            String hostAddress = dp.getAddress().getHostAddress();
            String str = new String(data, 0, length);

            System.out.println("数据是：" + str + " 主机名是：" + hostName + "主机地址是：" + hostAddress + "端口是：" + port);
        }
    }
}
