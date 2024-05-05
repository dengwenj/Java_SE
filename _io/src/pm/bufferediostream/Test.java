package pm.bufferediostream;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        // 创建缓冲流的对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("_io/src/pm/bufferediostream/test.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("_io/src/pm/bufferediostream/copy.txt"));

        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }

        bos.close();
        bis.close();
    }
}
