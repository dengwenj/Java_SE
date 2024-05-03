package pm.anli;

import java.io.File;

public class Demo4 {
    public static void main(String[] args) {
        // 删除某个文件夹下面的所有文件
        deleteRDir("/Users/dengwenjie/Java/java_learn/test");
    }

    public static void deleteRDir(String str) {
        File f1 = new File(str);
        File[] files = f1.listFiles();

        assert files != null;
//        for (File file : files) {
//            // 看 file 文件是否有子文件夹
//            File[] files1 = file.listFiles();
//
//            // 说明是有子文件夹的
//            if (files1 != null && files1.length != 0) {
//                deleteRDir(file.getAbsolutePath());
//            }
//            file.delete();
//        }

        for (File file : files) {
            if (file.isFile()) {
                file.delete();
            } else {
                deleteRDir(file.getAbsolutePath());
            }
        }
        f1.delete();
    }
}
