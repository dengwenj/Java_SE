package pm._copyfile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        // 输入、输出
        FileInputStream fis = new FileInputStream("_io/test.txt");
        FileOutputStream fos = new FileOutputStream("_io/src/pm/_copyfile/demo.txt");

        // 核心思想：边读边写
        int b;
        long startTime = System.currentTimeMillis();
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

        // 先开的最后关闭
        fos.close();
        fis.close();
    }
}
