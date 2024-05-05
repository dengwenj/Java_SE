package pm.convertstream;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class Test {
    public static void main(String[] args) throws IOException {
        // 转换流
        // 创建对象并指定字符编码
        InputStreamReader isr = new InputStreamReader(new FileInputStream("_io/src/pm/convertstream/test.txt"), "GBK");

        int ch;
        while ((ch = isr.read()) != -1) {
            System.out.print((char) ch);
        }
        isr.close();

        FileReader fr = new FileReader("_io/src/pm/convertstream/test.txt", Charset.forName("GBK"));
        int ch1;
        while ((ch1 = fr.read()) != -1) {
            System.out.print((char) ch1);
        }
        fr.close();
    }
}
