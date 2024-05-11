package pm.anli.demo04;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        // 客户端：将本地文件上传到服务器，接收服务器的反馈
        // 服务器：接收客户端上传的文件，上传完毕之后给出反馈
        Socket s = new Socket("127.0.0.1", 1209);

        OutputStream outputStream = s.getOutputStream();

        // 读取本地数据
        BufferedReader br = new BufferedReader(new FileReader("_network/src/pm/anli/demo04/test.txt"));

        String str;
        while ((str = br.readLine()) != null) {
            outputStream.write(str.getBytes());
            // 发送完一个数据后，可以发送一个换行符作为分隔
            // 如果需要客户端发送完一个数据单元后再发送下一个，
            // 同时又希望服务器能够在接收完一个数据单元后继续接收下一个，
            // 那么可以在每次发送一个数据单元后，客户端发送一个特殊的标记或者数据单元的结束符，
            // 服务器接收到这个标记或结束符后，再开始接收下一个数据单元
            outputStream.write("\n".getBytes());
        }

        // 结束标志
        s.shutdownOutput();

        // 接收服务端的数据
        InputStream inputStream = s.getInputStream();
        InputStreamReader isr = new InputStreamReader(inputStream);
        int read;
        while ((read = isr.read()) != -1) {
            System.out.print((char) read);
        }

        isr.close();
        br.close();
        s.close();
    }
}
