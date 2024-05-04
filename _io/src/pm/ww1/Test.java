package pm.ww1;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        // FileOutputStream
        FileOutputStream fos = new FileOutputStream("_io/demo.txt");
        // 输出到文件中
        fos.write(97);
        // 释放资源
        fos.close();
    }
}
