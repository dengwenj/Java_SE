package vip.dengwj.math;

public class Test {
    public static void main(String[] args) {
        // 常用方法
        // 绝对值
        System.out.println(Math.abs(11)); // 11
        System.out.println(Math.abs(-11)); // 11

        // 向上取整
        System.out.println(Math.ceil(11.2)); // 12.0
        System.out.println(Math.ceil(-13.43)); // -13.0

        // 向下取整
        System.out.println(Math.floor(11.45)); // 11.0
        System.out.println(Math.floor(-11.45)); // -12.0

        // 获取两个 int 值中的较大值和较小值
        System.out.println(Math.max(10, 20)); // 20
        System.out.println(Math.min(10, 20)); // 10

        // 返回 a 的 b 次幂的值
        System.out.println(Math.pow(2, 4)); // 16

        // 返回值为 double 的随机值，范围 [0.0, 1.0)
        System.out.println(Math.random());
        // 1- 100
        System.out.println(Math.floor(Math.random() * 100) + 1); // 随机  51.0

        // 开平方根
        System.out.println(Math.sqrt(4)); // 2.0

        // 开立方根
        System.out.println(Math.cbrt(8)); // 2.0
    }
}
