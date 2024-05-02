package pm.anli;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo3 {
    public static void main(String[] args) {
        // 把姓名和年龄拼接成：张三-23的字符串
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("朴睦", 24));
        list.add(new Student("韩梅梅", 18));
        list.add(new Student("李雷", 20));

        String[] strings = list.stream().map(Student::pj).toArray(String[]::new);
        System.out.println(Arrays.toString(strings)); // [朴睦-24, 韩梅梅-18, 李雷-20]
    }
}
