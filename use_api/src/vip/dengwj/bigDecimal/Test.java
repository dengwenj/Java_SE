package vip.dengwj.bigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test {
    public static void main(String[] args) {
        // 1、通过传递 double 类型的小数来创建对象
        // 细节：这种方式有可能是不精确的，不建议使用
        BigDecimal bd1 = new BigDecimal(0.1);
        System.out.println(bd1); // 0.1000000000000000055511151231257827021181583404541015625

        // 2、通过传递字符串表示的小数来创建对象
        BigDecimal bd2 = new BigDecimal("0.1");
        System.out.println(bd2); // 0.1

        // 3、通过静态方法获取对象
        BigDecimal bd3 = BigDecimal.valueOf(10);
        System.out.println(bd3); // 10
        BigDecimal bd4 = BigDecimal.valueOf(1.1);
        System.out.println(bd4); // 1.1
        // 细节：
        // 1、如果要表示的数字不大，没有超出 double 的取值范围，建议使用静态方法
        // 2、如果要表示的数字比较大，超出了 double 的取值范围，建议使用构造方法 字符串方式
        // 3、如果传递的是 0-10 之间的整数那么方法会返回已经创建好的对象，不会重新 new
        BigDecimal bd5 = BigDecimal.valueOf(5);
        BigDecimal bd6 = BigDecimal.valueOf(5);
        System.out.println(bd5 == bd6); // true
        BigDecimal bd7 = bd5.add(bd6);
        System.out.println(bd7); // 10

        // 方法
        BigDecimal bd8 = BigDecimal.valueOf(3);
        BigDecimal bd9 = BigDecimal.valueOf(10);
        BigDecimal bd10 = bd8.multiply(bd9);
        System.out.println(bd10); // 30
        BigDecimal bd11 = bd9.divide(bd8, 2, RoundingMode.HALF_UP);
        System.out.println(bd11);  // 3.33
    }
}
