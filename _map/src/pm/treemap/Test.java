package pm.treemap;

import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        // 需求1
        // 键：整数表示 id
        // 值：字符串表示商品名称
        // 要求：按照 id 的升序排序、按照 id 的降序排序

        TreeMap<Integer, String> tm = new TreeMap<>((o1, o2) -> o2 - o1); // 从大到小排序
        tm.put(1, "衣服");
        tm.put(3, "裤子");
        tm.put(4, "鞋子");
        tm.put(2, "袜子");

        // 默认是按照键的从小到大排序
        System.out.println(tm);
        System.out.println("----------------");

        TreeMap<Student, String> tm1 = new TreeMap<>();
        tm1.put(new Student("朴睦", 24), "上海");
        tm1.put(new Student("韩梅梅", 18), "北京");
        tm1.put(new Student("李雷", 24), "广州");
        // 按照学生年龄的升序排序，年龄一样按照姓名的字母排序，同姓名年龄视为同一个人
        System.out.println(tm1);
    }
}
