package pm.ww;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ReceiveMessage {
    public static void main(String[] args) throws IOException {
        // 创建 DatagramSocket 对象
        // 细节：
        // 在接收的时候，一定要绑定端口
        // 而且绑定的端口一定要跟发送的端口保持一致
        DatagramSocket datagramSocket = new DatagramSocket(1209);
        //InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
        //DatagramSocket datagramSocket = new DatagramSocket(1209, inetAddress);

        // 接收数据包
        byte[] bytes = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
        // 该方法是阻塞的
        // 等发送端发送完消息之后才执行后面
        datagramSocket.receive(datagramPacket);

        // 解析数据包
        byte[] data = datagramPacket.getData();
        int length = datagramPacket.getLength();
        InetAddress address = datagramPacket.getAddress();
        int port = datagramPacket.getPort();
        String str = new String(data, 0, length);

        System.out.println("接收到数据：" + str);
        System.out.println("该数据是从" + address + "这台电脑中的" + port + "端口来的");

        // 释放资源
        datagramSocket.close();
    }
}
