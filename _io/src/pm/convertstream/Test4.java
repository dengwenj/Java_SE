package pm.convertstream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {
    public static void main(String[] args) throws IOException {
        // 利用字节流读取文件中的数据，每次读一整行，而且不能出现乱码

        // 字节输入流
        FileInputStream fis = new FileInputStream("_io/src/pm/convertstream/test2.txt");
        // 字符转换输入流， InputStreamReader 字符流
        InputStreamReader isr = new InputStreamReader(fis);
        // 字符缓冲输入流
        BufferedReader br = new BufferedReader(isr);

        String s;
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }
    }
}
