package pm.ww3;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        // createNewFile 创建一个新的空的文件
        // 细节1：如果当前路径表示的文件时不存在的，则创建成功，方法返回 true
        // 如果当前路径表示的文件时存在的，创建失败，方法返回 false
        // 细节2：如果父级路径是不存在的，那么方法会有异常 IOException
        // 细节3：createNewFile 方法创建的一定是文件，如果路径中不包含后缀名，则创建一个没有后缀的文件
        String str = "/Users/dengwenjie/Java/java_learn/demo.txt";
        File f1 = new File(str);
        boolean newFile = f1.createNewFile();
        System.out.println(newFile);

        // mkdir，文件夹（目录）
        // 细节1：如果当前路径已经存在，则创建失败，返回 false
        // 细节2：mkdir 方法只能创建单级文件夹，无法创建多级文件夹
        File f2 = new File("/Users/dengwenjie/Java/java_learn/test");
        boolean mkdir = f2.mkdir();
        System.out.println(mkdir);

        // mkdirs 创建多级文件夹
        // 既可以创建单级的，又可以创建多级的文件夹
        File f3 = new File("/Users/dengwenjie/Java/java_learn/test/test/pm/ww");
        boolean mkdirs = f3.mkdirs();
        System.out.println(mkdirs);

        // 如果删除的是文件，则直接删除，不走回收站
        // 如果删除的是空文件夹，则直接删除，不走回收站
        // 如果删除的是有内容的文件夹，则删除失败
        File f4 = new File(str);
        boolean delete = f4.delete();
        System.out.println(delete);
    }
}
