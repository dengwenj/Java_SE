package pm.anli;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Demo1 {
    public static void main(String[] args) {
        // 集合中存储一些字符串的数据，比如：张三,23
        // 收集到 Student 类型的数组当中（使用方法引用完成）
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张三,23", "李四,24", "王五,25");

        Student[] students = list.stream()
            .map(Student::new)
            .toArray(Student[]::new);

        // [Student{name = 张三, age = 23}, Student{name = 李四, age = 24}, Student{name = 王五, age = 25}]
        System.out.println(Arrays.toString(students));
    }
}
