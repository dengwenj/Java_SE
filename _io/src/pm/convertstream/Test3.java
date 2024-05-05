package pm.convertstream;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Test3 {
    public static void main(String[] args) throws IOException {
        // 将本地文件的 GBK，转成 UTF-8
        InputStreamReader isr = new InputStreamReader(new FileInputStream("_io/src/pm/convertstream/test1.txt"), "GBK");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("_io/src/pm/convertstream/test2.txt"), StandardCharsets.UTF_8);

        int read;
        while ((read = isr.read()) != -1) {
            osw.write(read);
        }
        osw.close();
        isr.close();

        // 第二种方式，JDK11以上
        FileReader fr = new FileReader("_io/src/pm/convertstream/test1.txt", Charset.forName("GBK"));
        FileWriter fw = new FileWriter("_io/src/pm/convertstream/test2.txt", StandardCharsets.UTF_8);

        int read1;
        while ((read1 = fr.read()) != -1) {
            fw.write(read1);
        }
        fw.close();
        fr.close();
    }
}
