package pm.anli.demo02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        // 创建对象
        ServerSocket ss = new ServerSocket(1209);

        // 连接客户端
        Socket accept = ss.accept();

        InputStream inputStream = accept.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));

        int i;
        while ((i = br.read()) != -1) {
            System.out.print((char) i);
        }

        br.close();
        accept.close();
    }
}
