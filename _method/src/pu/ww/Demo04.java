package pu.ww;

public class Demo04 {
    public static void main(String[] args) {
        // 功能类似的方法使用同一名字，更容易记住，因此，调用起来更简单
        // 方法重载 实参和形参一一对应就会去调用对应的方法
        diffHello();
        diffHello("朴睦");
        diffHello("朴睦", 24);
    }

    public static void diffHello() {
        System.out.println("Hello world");
    }

    public static void diffHello(String name) {
        System.out.println("Hello" + name);
    }

    public static void  diffHello(String name, int age) {
        System.out.println("Hello" + name + "age" + age);
    }

}
