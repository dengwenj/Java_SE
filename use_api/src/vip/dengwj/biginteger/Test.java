package vip.dengwj.biginteger;

import java.math.BigInteger;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        // 获取一个随机的大整数
        BigInteger b1 = new BigInteger(4, new Random()); // [0 ~ 15] 范围内
        System.out.println(b1);

        // 获取一个指定的大整数
        // 细节：字符串中必须是整数，否则会报错
        BigInteger b2 = new BigInteger("99999");
        System.out.println(b2); // 99999

        // 获取指定进制的大整数
        // 细节：
        // 1、字符串中的数字必须是整数
        // 2、字符串中的数字必须要跟进制吻合
        // 比如二进制中，那么只能写 0 和 1，写其他的就报错
        BigInteger b3 = new BigInteger("101", 2);
        System.out.println(b3); // 5

        // 静态方法, 内部有优化
        // 细节：
        // 1、能表示范围比较小，只能在 long 的取值范围内，如果超出 long 的范围就不行了
        // 2、在内部对常用的数字：-16 ~ 16 进行了优化
        // 提前把 -16 ~ 16 先创建好 BigInteger 的对象，如果多次获取不会重新创建新的
        BigInteger b4 = BigInteger.valueOf(13);
        BigInteger b5 = BigInteger.valueOf(13);
        System.out.println(b4); // 13
        System.out.println(b4 == b5); // true

        BigInteger b6 = BigInteger.valueOf(10011);
        BigInteger b7 = BigInteger.valueOf(10011);
        System.out.println(b6 == b7); // false
    }
}
