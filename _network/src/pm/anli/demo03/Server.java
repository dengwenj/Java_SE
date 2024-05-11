package pm.anli.demo03;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(1209);

        Socket accept = ss.accept();

        InputStream inputStream = accept.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

        int i;
        while ((i = inputStreamReader.read()) != -1) {
            System.out.print((char) i);
        }

        // 给客户端返回数据
        OutputStream acceptOutputStream = accept.getOutputStream();
        String str = "我也很开心";
        acceptOutputStream.write(str.getBytes());

        ss.close();
    }
}
