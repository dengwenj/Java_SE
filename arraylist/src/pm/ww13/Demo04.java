package pm.ww13;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        // 定义一个集合，添加一些学生对象，并进行遍历，属性：姓名，年龄
        ArrayList<Student> list = new ArrayList<>();

        System.out.println("请输入学生信息");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入学生姓名");
            String name = sc.next();
            System.out.println("请输入学生年龄");
            int age = sc.nextInt();
            list.add(new Student(name, age));
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() + list.get(i).getAge());
        }
    }
}
