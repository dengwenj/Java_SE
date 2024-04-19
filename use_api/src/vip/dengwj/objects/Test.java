package vip.dengwj.objects;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        boolean res = Objects.equals(s1, s2);
        System.out.println(res); // false
        // 细节：
        // 1、方法的底层会判断 s1 是否为 null，如果为 null，直接返回 false
        // 2、如果 s1 不为 null，那么就利用 s1 再次调用 equals 方法
        // 3、此时 s1 是 Student 类型，所以最终还是会调用 Student 中的 equals 方法
        // 如果没有重写，比较地址值，如果重写了，就比较属性值

        Student s3 = null;
        System.out.println(Objects.isNull(s1)); // false
        System.out.println(Objects.isNull(s3)); // true
        System.out.println(Objects.nonNull(s1)); // true
        System.out.println(Objects.nonNull(s3)); // false
    }
}
