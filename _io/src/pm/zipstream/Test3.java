package pm.zipstream;

import java.io.*;
import java.util.Objects;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Test3 {
    public static void main(String[] args) throws IOException {
        File src = new File("/Users/dengwenjie/Desktop/z");
        File dest = new File("/Users/dengwenjie/Desktop/dest.zip");

        toZip(src, dest);
    }

    public static void toZip(File src, File dest) throws IOException {
        // 压缩文件夹
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));

        // 先读
        readWrite(Objects.requireNonNull(src.listFiles()), zos, src.getName());

        zos.close();
    }

    public static void readWrite(File[] files, ZipOutputStream zos, String name) throws IOException {
        for (File file : files) {
            // 是文件
            if (file.isFile()) {
                // 创建 ZipEntry 对象，表示压缩包里面的每一个文件或文件夹
                ZipEntry entry = new ZipEntry(name + "/" + file.getName());
                // 把 ZipEntry 对象放到压缩包中
                zos.putNextEntry(entry);

                // 读
                FileInputStream fis = new FileInputStream(file);

                byte[] bytes = new byte[1024];
                int len;
                while ((len = fis.read(bytes)) != -1) {
                    zos.write(bytes, 0, len);
                }

                zos.closeEntry();
                fis.close();
            } else {
                // 是文件夹
                readWrite(Objects.requireNonNull(file.listFiles()), zos, name + "/" + file.getName());
            }
        }
    }
}
