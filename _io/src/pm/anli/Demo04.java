package pm.anli;

import java.io.*;

public class Demo04 {
    public static void main(String[] args) throws IOException {
        // 拷贝文件
        // 四种方式拷贝文件，并统计各自用时

        // 字节流的基本流：一次读写一个字节
        FileInputStream fis1 = new FileInputStream("_io/src/pm/anli/test.txt");
        FileOutputStream fos1 = new FileOutputStream("_io/src/pm/anli/copy.txt");

        int b;
        long l = System.currentTimeMillis();
        while ((b = fis1.read()) != -1) {
            fos1.write(b);
        }
        long l1 = System.currentTimeMillis();
        System.out.println(l1 - l);
        fos1.close();
        fis1.close();

        // 字节流的基本流：一次读写一个字节数组
        FileInputStream fis2 = new FileInputStream("_io/src/pm/anli/test.txt");
        FileOutputStream fos2 = new FileOutputStream("_io/src/pm/anli/copy.txt");

        byte[] bytes = new byte[1024];
        int len;
        long l2 = System.currentTimeMillis();
        while ((len = fis2.read(bytes)) != -1) {
            fos2.write(bytes, 0, len);
        }
        long l3 = System.currentTimeMillis();
        System.out.println(l3 - l2);
        fos2.close();
        fis2.close();

        // 字节缓冲流：一次读写一个字节
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("_io/src/pm/anli/test.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("_io/src/pm/anli/copy.txt"));

        int b2;
        long l4 = System.currentTimeMillis();
        while ((b2 = bis.read()) != -1) {
            bos.write(b2);
        }
        long l5 = System.currentTimeMillis();
        System.out.println(l5 - l4);
        bos.close();
        bis.close();

        // 字节缓冲流：一次读写一个字节数组
        BufferedInputStream bis1 = new BufferedInputStream(new FileInputStream("_io/src/pm/anli/test.txt"));
        BufferedOutputStream bos1 = new BufferedOutputStream(new FileOutputStream("_io/src/pm/anli/copy.txt"));

        byte[] bytes1 = new byte[1024];
        int len1;
        long l6 = System.currentTimeMillis();
        while ((len1 = bis1.read(bytes1)) != -1) {
            bos1.write(bytes1, 0, len1);
        }
        long l7 = System.currentTimeMillis();
        System.out.println(l7 - l6);
        bos1.close();
        bis1.close();
    }
}
