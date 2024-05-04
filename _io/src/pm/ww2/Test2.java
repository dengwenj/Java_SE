package pm.ww2;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        // 换行和续写, 创建对象时第二个参数传递 true 开启续写
        FileOutputStream fos = new FileOutputStream("_io/demo.txt", true);

        String str = "nihaoshijie";
        fos.write(str.getBytes());

        // 换行
        // mac \r, window \r\n
        String str1 = "\r";
        fos.write(str1.getBytes());

        String str2 = "666";
        fos.write(str2.getBytes());

        fos.close();
    }
}
