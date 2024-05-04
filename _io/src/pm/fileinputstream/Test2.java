package pm.fileinputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        // 循环读取
        FileInputStream fis = new FileInputStream("_io/test.txt");

        int b;
        while ((b = fis.read()) != -1) {
            System.out.println((char) b);
        }

        fis.close();
    }
}
