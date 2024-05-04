package pm.ww2;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        // FileOutputStream 写数据的3种方式
        FileOutputStream fos = new FileOutputStream("_io/test.txt");
        // fos.write(97);

        byte[] bytes = {97, 98, 99, 100, 101};
        // fos.write(bytes);

        fos.write(bytes, 3, 2); // 2是要写几个
        fos.close();
    }
}
