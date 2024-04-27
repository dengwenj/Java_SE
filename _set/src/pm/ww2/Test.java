package pm.ww2;

import java.util.LinkedHashSet;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("朴睦", 24);
        Student s2 = new Student("李雷", 20);
        Student s3 = new Student("韩梅梅", 18);
        Student s4 = new Student("朴睦", 24);

        LinkedHashSet<Student> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(s1);
        linkedHashSet.add(s2);
        linkedHashSet.add(s3);
        linkedHashSet.add(s4);

        // 有序的 [Student{name = 朴睦, age = 24}, Student{name = 李雷, age = 20}, Student{name = 韩梅梅, age = 18}]
        System.out.println(linkedHashSet);
    }
}
