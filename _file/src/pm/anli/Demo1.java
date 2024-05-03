package pm.anli;

import java.io.File;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        // 在当前模块下的 aaa 文件夹中创建一个 a.txt 文件
        String str = "/Users/dengwenjie/Java/java_learn/_file/aaa";
        File f1 = new File(str);
        f1.mkdirs();
        File f2 = new File(f1, "a.txt");
        boolean newFile = f2.createNewFile();
        System.out.println(newFile);
    }
}
