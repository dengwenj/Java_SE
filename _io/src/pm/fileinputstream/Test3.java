package pm.fileinputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class Test3 {
    public static void main(String[] args) throws IOException {
        //一次读多个字节
        FileInputStream fis = new FileInputStream("_io/demo.txt");

        byte[] bytes = new byte[2];
        // 返回值：一次读了多少个字节
        // 读取的数据会放入到 bytes 里
        int len1 = fis.read(bytes);
        String str1 = new String(bytes, 0, len1);
        System.out.println(len1); // 2
        System.out.println(str1); // ab

        // bytes 会覆盖前面的数据
        int len2 = fis.read(bytes);
        String str2 = new String(bytes, 0, len2);
        System.out.println(len2); // 2
        System.out.println(str2); // cd

        int len3 = fis.read(bytes);
        String str3 = new String(bytes, 0, len3);
        System.out.println(len3); // 1
        System.out.println(str3); // e
    }
}
