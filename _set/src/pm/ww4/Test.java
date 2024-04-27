package pm.ww4;

import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        // 自定义的对象排序
        TreeSet<Student> ts = new TreeSet<>();

        ts.add(new Student("朴睦", 24));
        ts.add(new Student("韩梅梅", 20));
        ts.add(new Student("李雷", 18));

        // [Student{name = 李雷, age = 18}, Student{name = 韩梅梅, age = 20}, Student{name = 朴睦, age = 24}]
        System.out.println(ts);
    }
}
