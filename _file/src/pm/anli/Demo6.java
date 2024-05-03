package pm.anli;

import java.io.File;
import java.util.Objects;

public class Demo6 {
    public static void main(String[] args) {
        // 统计文件夹的大小, 把所有文件累加
        long len = getLen("/Users/dengwenjie/Java/java_learn/_file/aaa/bbb");
        System.out.println(len);
    }

    public static long getLen(String str) {
        File f1 = new File(str);

        long len = 0;
        for (File file : Objects.requireNonNull(f1.listFiles())) {
            if (file.isFile()) {
                len += file.length();
            } else {
                len += getLen(file.getAbsolutePath());
            }
        }

        return len;
    }
}
