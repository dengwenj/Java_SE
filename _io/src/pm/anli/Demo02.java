package pm.anli;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo02 {
    public static void main(String[] args) throws IOException {
        // 文件加密
        // 加密原理：对原始文件中的每一个字节数据进行更改，然后将更改以后的数据存储到新的文件中
        // 解密原理：读取加密之后的文件，按照加密的规则反向操作，变成原始文件
        FileInputStream fis = new FileInputStream("_io/yswj.txt");
        FileOutputStream fos = new FileOutputStream("_io/jiamwj.txt");

        byte[] bytes = new byte[200];
        int len;
        while ((len = fis.read(bytes)) != -1) {
            // 加密 +1
            for (int i = 0; i < bytes.length; i++) {
                bytes[i] += 1;
            }
            fos.write(bytes, 0, len);
        }
        fos.close();
        fis.close();

        // 解密
        FileInputStream fis1 = new FileInputStream("_io/jiamwj.txt");
        FileOutputStream fos1 = new FileOutputStream("_io/jiemwj.txt");

        byte[] bytes1 = new byte[200];
        int len1;
        while ((len1 = fis1.read(bytes1)) != -1) {
            // 解密 -1
            for (int i = 0; i < bytes1.length; i++) {
                bytes1[i] -= 1;
            }
            fos1.write(bytes1, 0, len1);
        }
        fos1.close();
        fis1.close();
    }
}
