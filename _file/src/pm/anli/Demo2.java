package pm.anli;

import java.io.File;
import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
        // 定义一个方法找某一个文件夹中，是否有以 avi 结尾的电影
        File[] avi = getAvi();
        System.out.println(Arrays.toString(avi));
        if (avi.length == 0) {
            System.out.println("有avi结尾的文件");
        } else {
            System.out.println("没有avi结尾的文件");
        }
    }

    public static File[]  getAvi() {
        String str = "/Users/dengwenjie/Java/java_learn/_file/aaa";
        File f1 = new File(str);

        System.out.println(Arrays.toString(f1.listFiles()));

        return f1.listFiles((file) -> file.isFile() && file.getName().endsWith(".avi"));
    }
}
