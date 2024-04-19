package vip.dengwj.object;

public class Test2 {
    public static void main(String[] args) {
        // equals 比较两个对象是否相等 地址值
        //Student s1 = new Student("张三", 20);
        //Student s2 = new Student("李四", 18);
        //System.out.println(s1.equals(s2)); // false, 没重写之前

        Student s1 = new Student("张三", 20);
        Student s2 = new Student("张三", 20);
        // 重写之后就是判断里面的属性值是否一样
        System.out.println(s1.equals(s2)); // true

        // 结论：
        // 1、如果没有重写 equals 方法，那么默认使用 Object 中的方法进行比较，比较的是地址值是否相等
        // 2、一般来讲地址值对于我们意义不大，所以我们会重写，重写之后比较的就是对象内部的属性值

        // 例
        String s = "abc";
        StringBuilder sb = new StringBuilder("abc");

        System.out.println(s.equals(sb)); // false
        // 因为 equals 方法是被 s 调用的，而 s 是字符串
        // 所以 equals 要看 String 类中的
        // 字符串中的 equals 方法，先判断参数是否为字符串，是再比较内部的属性，不是字符串直接返回 false

        System.out.println(sb.equals(s)); // false
        // 因为 equals 方法是被 sb 调用的，而 sb 是 StringBuilder 类
        // 所以这里的 equals 方法要看 StringBuilder 中的 equals 方法
        // StringBuilder 里面的 equals 没有重写，所以就看的 Object 中的 equals，比较的是地址值是否一致
    }
}
