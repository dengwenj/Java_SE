package pm.ww;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test {
    public static void main(String[] args) throws UnknownHostException {
        // 确定主机名称的 IP 地址，主机名称可以是机器名称，也可以是 IP 地址
        InetAddress byName = InetAddress.getByName("192.168.0.255");
        System.out.println(byName.getHostName()); // 获取此 IP 地址的主机名
        System.out.println(byName.getHostAddress()); // 返回文本显示中的 IP 地址字符串
    }
}
