package pm.filereader;

import java.io.FileReader;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        // 字符输入流
        FileReader fr = new FileReader("_io/src/pm/filereader/demo.txt");

        // 循环读取
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }

        fr.close();
    }
}
