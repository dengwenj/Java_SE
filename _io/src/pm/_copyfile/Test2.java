package pm._copyfile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) throws IOException {
        // 一次读多个字节拷贝
        FileInputStream fis = new FileInputStream("_io/test.txt");
        FileOutputStream fos = new FileOutputStream("_io/src/pm/_copyfile/demo.txt");

        byte[] bytes = new byte[10];
        int len; // 读了多少个
        while ((len = fis.read(bytes)) != -1) {
            // 读多少写多少，0 到 len
            fos.write(bytes, 0, len);
        }

        System.out.println(Arrays.toString(bytes));
        fos.close();
        fis.close();
    }
}
