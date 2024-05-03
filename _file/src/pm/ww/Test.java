package pm.ww;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        // 创建文件对象
        String str = "/Users/dengwenjie/Desktop/h.jpeg";
        File f1 = new File(str);
        System.out.println(f1);

        String str1 = "/Users/dengwenjie/Desktop";
        File f2 = new File(str1, "h.jpeg");
        System.out.println(f2);

        File f3 = new File(str1);
        File f4 = new File(f3, "h.jpeg");
        System.out.println(f4); // /Users/dengwenjie/Desktop/h.jpeg
    }
}
