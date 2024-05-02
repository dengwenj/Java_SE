package pm.ww3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // 集合里面存储姓名和年龄，比如：张无忌,15
        // 将数据封装成 Student 对象并收集到 List 集合中
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌,15", "朴睦,24");

        List<Student> students = list.stream()
            .map(Student::new)
            .toList();
        System.out.println(students); // [Student{name = 张无忌, age = 15}, Student{name = 朴睦, age = 24}]
    }
}
