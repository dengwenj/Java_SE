package pm.fileinputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        // 从本地文件读取数据
        FileInputStream fis = new FileInputStream("_io/test.txt");

        // 读取数据
        int read1 = fis.read();
        System.out.println((char) read1); // a
        int read2 = fis.read();
        System.out.println((char) read2); // b
        int read3 = fis.read();
        System.out.println((char) read3); // c
        int read4 = fis.read();
        System.out.println((char) read4); // d
        int read5 = fis.read();
        System.out.println((char) read5); // e

        // 释放资源
        fis.close();
    }
}
