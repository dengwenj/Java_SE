package pm.anli;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
        // 创建集合添加学生对象，学生对象属性：name, age
        // 只获取姓名并放到数组当中
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("朴睦", 24));
        list.add(new Student("韩梅梅", 18));
        list.add(new Student("李雷", 20));

        String[] strings = list.stream().map(Student::getName).toArray(String[]::new);
        System.out.println(Arrays.toString(strings)); // [朴睦, 韩梅梅, 李雷]
    }
}
