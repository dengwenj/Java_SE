package vip.dengwj.biginteger;

import java.math.BigInteger;

public class Test2 {
    public static void main(String[] args) {
        // BigInteger 对象的方法
        BigInteger b1 = BigInteger.valueOf(110);
        BigInteger b2 = BigInteger.valueOf(109);

        // 加减乘除
        BigInteger b3 = b1.add(b2);
        System.out.println(b3); // 13
        BigInteger b4 = b1.subtract(b2); // 7
        System.out.println(b4);
        BigInteger b5 = b1.multiply(b2);
        System.out.println(b5); // 30
        BigInteger b6 = b1.divide(b2);
        System.out.println(b6); // 3

        // 除，获取商和除数
        BigInteger[] b7 = b1.divideAndRemainder(b2);
        System.out.println(b7[0] + ", " + b7[1]); // 3, 1

        // 比较是否相同, 比较的是它内部的值
        boolean res = b1.equals(b2);
        System.out.println(b1 == b2); // false
        System.out.println(res); // true

        // 次幂
        BigInteger b8 = b1.pow(2);
        System.out.println(b8);

        // 最大最小值
        BigInteger b9 = b1.max(b2);
        System.out.println(b9);

        // 转换为 int 类型整数，超出范围数据有误
        int num = b1.intValue();
        System.out.println(num); // 110
    }
}
