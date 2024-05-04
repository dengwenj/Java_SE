package pm.filewrite;

import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("_io/demo.txt", true);

        // 写出一个字符
        // fw.write('你');
        // 写出一个字符串
        // fw.write("你好世界");
        // fw.write("你好世界啊", 1, 2); // 好世
        char[] chars = {'a', 'b', '好'};
        // fw.write(chars);
        fw.write(chars, 1, 2); // b好

        fw.close();
    }
}
