package pm.zipstream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Test1 {
    public static void main(String[] args) throws IOException {
        File src = new File("/Users/dengwenjie/Desktop/test.zip");
        System.out.println(src);
        File dest = new File("_io/zipdist");

        zipCopy(src, dest);
    }

    public static void zipCopy(File src, File dest) throws IOException {
        // 创建解压缩流
        ZipInputStream zis = new ZipInputStream(new FileInputStream(src));

        // 获取么一个 entry 对象
        ZipEntry entry;
        while ((entry = zis.getNextEntry()) != null) {
            // 说明是文件夹
            if (entry.isDirectory()) {
                File file = new File(dest, entry.getName());
                file.mkdirs();
            } else {
                // 说明是文件
                // 读文件写入进去
                FileOutputStream fos = new FileOutputStream(new File(dest, entry.getName()));
                byte[] bytes = new byte[1024];
                int len;
                while ((len = zis.read(bytes)) != -1) {
                    fos.write(bytes, 0, len);
                }
                fos.close();
                // 表示在压缩包中的一个文件处理完毕了
                zis.closeEntry();
            }
        }

        zis.close();
    }
}
