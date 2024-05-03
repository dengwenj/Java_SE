package pm.ww2;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        String str = "/Users/dengwenjie/Desktop/test.txt";
        File f1 = new File(str);
        System.out.println(f1.isDirectory()); // false
        System.out.println(f1.isFile()); // true
        System.out.println(f1.exists()); // true
        // 返回文件的大小，字节, 如果我们要获取一个文件夹的大小，需要把这个文件夹里面所有的文件大小都累加在一起
        System.out.println(f1.length()); // 12
        // 返回文件的绝对路径
        System.out.println(f1.getAbsolutePath()); // /Users/dengwenjie/Desktop/test.txt

        File f2 = new File("./java_learn/test.txt");
        System.out.println(f2.getAbsolutePath()); // /Users/dengwenjie/Java/java_learn/./java_learn/test.txt
        // 返回定义文件时使用的路径
        System.out.println(f2.getPath()); // ./java_learn/test.txt
        // 返回文件的名称
        System.out.println(f2.getName()); // test.txt

        // 返回文件的最后修改时间
        long l = f1.lastModified();
        System.out.println(l);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(l);
        System.out.println(format);
    }
}
