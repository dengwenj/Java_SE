package pm.filewrite;

import java.io.FileWriter;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("_io/demo.txt");

        // 也会先放入缓冲区
        fw.write("你好");
        fw.write("世界");
        fw.flush();

        fw.write("朴睦");
        fw.close();

        // 后面不能在写了，因为流关闭了
        // fw.write("哈哈");
    }
}
