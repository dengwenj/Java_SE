package pm.printstream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Test2 {
    public static void main(String[] args) throws IOException {
        // 字符打印流
        PrintWriter pw = new PrintWriter(new FileWriter("_io/src/pm/printstream/test1.txt"), true);

        pw.println("你好，我是朴睦");
        pw.print("哈哈哈哈");
        pw.printf("%s是谁", "朴睦");

        pw.close();
    }
}
