package pm.anli;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        // 拷贝
        // 拷贝一个文件夹，考虑子文件夹
        File f1 = new File("test");
        File f2 = new File("test1");

        copyDir(f1, f2);
    }

    public static void copyDir(File src, File target) throws IOException {
        // 先创建这个文件夹
        target.mkdirs();

        for (File file : Objects.requireNonNull(src.listFiles())) {
            System.out.println(file.getName() + "打印");

            // 是文件
            if (file.isFile()) {
                // 拷贝
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(new File(target, file.getName()));

                byte[] bytes = new byte[1024 * 1024]; // 1M
                int len;
                while ((len = fis.read(bytes)) != -1) {
                    fos.write(bytes, 0, len);
                }
            } else {
                // 是文件夹
                copyDir(file, new File(target, file.getName()));
            }
        }
    }
}
