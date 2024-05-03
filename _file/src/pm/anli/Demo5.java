package pm.anli;

import java.io.File;
import java.util.HashMap;
import java.util.Objects;

public class Demo5 {
    public static void main(String[] args) {
        // 统计一个文件夹中每种文件的个数并打印
        System.out.println(sumFile("/Users/dengwenjie/Java/java_learn/test"));
    }

    public static HashMap<String, Integer> sumFile(String str) {
        HashMap<String, Integer> map = new HashMap<>();

        File f1 = new File(str);
        for (File file : Objects.requireNonNull(f1.listFiles())) {
            if (file.isFile()) {
                String name = file.getName();
                String suffix = name.split("\\.")[1];

                // 存在该 key
                if (map.containsKey(suffix)) {
                    Integer count = map.get(suffix);
                    map.put(suffix, ++count);
                } else {
                    // 不存在该 key
                    map.put(suffix, 1);
                }
            } else {
                // 说明是文件夹

                File[] files = file.listFiles();
                // 说明是有子文件夹的
                if (files != null && files.length != 0) {
                    // 这样直接可以赋值的原因是因为文件夹永远在文件的上面，其实这样是有问题的
                    // map = sumFile(file.getAbsolutePath());

                    HashMap<String, Integer> map1 = sumFile(file.getAbsolutePath());
                    map1.forEach((key, val) -> {
                        // key 是否在 map 里面存在
                        if (map.containsKey(key)) {
                            Integer count = map.get(key);
                            // 加起来 count + val
                            map.put(key, count + val);
                        } else {
                            map.put(key, val);
                        }
                    });
                }
            }
        }

        return map;
    }
}
