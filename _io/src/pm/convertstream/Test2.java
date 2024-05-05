package pm.convertstream;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class Test2 {
    public static void main(String[] args) throws IOException {
        // 写
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("_io/src/pm/convertstream/test1.txt"), "GBK");
        osw.write("你好世界");
        osw.close();

        FileWriter fw = new FileWriter("_io/src/pm/convertstream/test1.txt", Charset.forName("GBK"));
        fw.write("你好世界朴睦");
        fw.close();
    }
}
