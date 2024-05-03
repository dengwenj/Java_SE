package pm.ww4;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        // 获取当前该路径下所有的内容
        File f1 = new File("/Users/dengwenjie/Java/java_learn/test");
        File[] files = f1.listFiles();

        assert files != null;
        System.out.println(files.length);
        for (File file : files) {
            System.out.println(file);
        }
    }
}
