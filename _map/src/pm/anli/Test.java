package pm.anli;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        // 存储学生对象并遍历
        // 创建一个 HashMap 集合，键是学生对象（Student），值是籍贯（String）
        // 存储三个键值对元素，并遍历
        // 要求：同姓名，同年龄认为是同一个学生
        Map<Student, String> map = new HashMap<>();
        map.put(new Student("朴睦", 24), "上海");
        map.put(new Student("李雷", 20), "北京");
        map.put(new Student("韩梅梅", 18), "北京");
        map.put(new Student("韩梅梅", 18), "北京");

        map.forEach((key, val) -> {
            System.out.println(key);
            System.out.println(val);
        });
    }
}
