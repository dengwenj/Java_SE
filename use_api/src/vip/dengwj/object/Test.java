package vip.dengwj.object;

public class Test {
    public static void main(String[] args) {
        // toString
        Object o1 = new Object();
        Object o2 = new Object();
        // 返回对象的字符串表示形式
        System.out.println(o1.toString()); // java.lang.Object@36baf30c
        System.out.println(o2.toString()); // java.lang.Object@7a81197d

        // 获取对象的属性
        Student s1 = new Student("张三", 20);
        Student s2 = new Student();
        System.out.println(s1.toString()); // Student{name='张三', age=20}

        // toString 方法结论：
        // 如果我们打印一个对象，想要看到属性值的话，那么就重写 toString 方法就可以了
        // 在重写的方法中，把对象的属性进行拼接
    }
}
