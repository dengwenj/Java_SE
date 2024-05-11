package pm.ww3;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        // 创建客户端 Socket 对象
        Socket s = new Socket("127.0.0.1", 1209);

        OutputStream outputStream = s.getOutputStream();
        // 转换成字符流
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(outputStream));

        String str = "你好，朴睦";
        bw.write(str);

        // 释放资源
        bw.close();
        s.close();
    }
}
