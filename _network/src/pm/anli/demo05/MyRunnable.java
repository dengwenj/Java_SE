package pm.anli.demo05;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class MyRunnable implements Runnable {
    private final Socket accept;

    public MyRunnable(Socket accept) {
        this.accept = accept;
    }

    @Override
    public void run() {
        try {
            // 读取客户端给的数据
            InputStream inputStream = accept.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            // 使用 uuid 保证文件不重复
            String name = UUID.randomUUID().toString().replace("-", "");
            // 写入数据
            BufferedWriter bw = new BufferedWriter(new FileWriter("_network/src/pm/anli/demo05/" + name + ".txt"));

            String read;
            while ((read = br.readLine()) != null) {
                // 写入到本地
                bw.write(read);
                bw.newLine();
                bw.flush();
            }

            // 写入成功后通知客户端
            OutputStream outputStream = accept.getOutputStream();
            String str = "上传成功";
            outputStream.write(str.getBytes());

            // 释放资源
            bw.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (accept != null) {
                    accept.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
