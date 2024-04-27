package pm.ww1;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        // 创建一个存储学生对象的集合，存储多个学生对象
        // 要求：学生对象的成员变量值相同，认为是同一个对象
        Student s1 = new Student("朴睦", 24);
        Student s2 = new Student("李雷", 20);
        Student s3 = new Student("韩梅梅", 18);
        Student s4 = new Student("朴睦", 24);

        HashSet<Student> s = new HashSet<>();
        s.add(s1);
        s.add(s2);
        s.add(s3);
        s.add(s4);

        // 没重写 hashCode 和 equals 方法之前 [Student{name = 韩梅梅, age = 18}, Student{name = 朴睦, age = 24}, Student{name = 朴睦, age = 24}, Student{name = 李雷, age = 20}]
        System.out.println(s);

        // 重写了 hashCode 和 equals 方法之后 [Student{name = 朴睦, age = 24}, Student{name = 韩梅梅, age = 18}, Student{name = 李雷, age = 20}]
        System.out.println(s);
    }
}
