package pm.printstream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        // 打印流
        PrintStream ps = new PrintStream("_io/src/pm/printstream/test.txt");

        ps.println(97);
        ps.print("你好啊");
        ps.println("");
        ps.printf("%s是%s", "朴睦", "dengwj");
        ps.close();
    }
}
