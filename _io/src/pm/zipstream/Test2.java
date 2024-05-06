package pm.zipstream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Test2 {
    public static void main(String[] args) throws IOException {
        // 压缩单个文件
        File src = new File("_io/src/pm/zipstream/test.txt");
        File dest = new File("/Users/dengwenjie/Desktop/test.zip");

        toZip(src, dest);
    }

    public static void toZip(File src, File dest) throws IOException {
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));

        // 创建 ZipEntry 对象，表示压缩包里面的每一个文件或文件夹
        ZipEntry entry = new ZipEntry("test.txt");
        // 把 ZipEntry 对象放到压缩包中
        zos.putNextEntry(entry);
        // 把 src 文件中的数据写到压缩包中
        FileInputStream fis = new FileInputStream(src);

        byte[] bytes = new byte[1024];
        int len;
        while ((len = fis.read(bytes)) != -1) {
            zos.write(bytes, 0, len);
        }
        fis.close();

        zos.closeEntry();
        zos.close();
    }
}
