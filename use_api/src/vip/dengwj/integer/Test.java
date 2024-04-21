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
        System.out.println("---------");

        // Integer 静态方法
        // 得到二进制
        String s = Integer.toBinaryString(100);
        System.out.println(s); // 1100100
        // 得到八进制
        String s1 = Integer.toOctalString(100);
        System.out.println(s1); // 144
        // 得到十六进制
        String s2 = Integer.toHexString(100);
        System.out.println(s2); // 64

        // 将字符串类型的整数转成 int 类型的整数
        int i = Integer.parseInt("123");
        System.out.println(i); // 123
        System.out.println(i + 1); // 124
        // 在类型转换的时候，括号中的参数只能是数字不能是其他
        // 8种包装类当中，除了 Character 都有对应的 parseXxx 的方法，进行类型转换
        String str = "true";
        boolean b = Boolean.parseBoolean(str);
        System.out.println(b); // true
    }
}
