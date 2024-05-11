package pm.anli.demo06;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
    private static final ArrayList<Socket> user = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(1209);

        while (true) {
            Socket socket = ss.accept();

            user.add(socket);

            System.out.println(user);
            InputStream inputStream = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            String data = br.readLine();

            // 给客户端返回数据
            for (Socket socket1 : user) {
                OutputStream outputStream = socket1.getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(outputStream);
                osw.write(data);

                // 释放资源
                osw.close();
            }
            br.close();
        }

        // br.close();
    }
}
