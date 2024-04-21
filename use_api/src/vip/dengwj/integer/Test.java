package vip.dengwj.integer;

public class Test {
    public static void main(String[] args) {
        // int 的包装类 Integer
        // 自动装箱：把基本数据类型会自动的变成其对应的包装类
        // 自动拆箱：把包装类自动的变成其对象的基本数据类型
        // 在底层，此时还会去自动调用静态方法 valueOf 得到一个 Integer 对象，只不过这个动作不需要我们自己去做了
        Integer i1 = 10;
        Integer i2 = 20;
        int i3 = i1 + i2;
        System.out.println(i3);
    }
}
