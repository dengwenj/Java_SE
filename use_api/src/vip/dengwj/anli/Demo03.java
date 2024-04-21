package vip.dengwj.anli;

import java.math.BigInteger;

public class Demo03 {
    public static void main(String[] args) {
        // 自己实现 toBinaryString 方法的效果，将一个十进制整数转成字符串表示的二进制
        // 除基取余法
        // 不断的除以基数（几进制，基数就是几）得到余数
        // 直到商为0，再将余数倒着拼接起来
        String s = myToBinaryString(6);
        System.out.println(s);
    }

    public static String myToBinaryString(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        while (num != 0) {
            int s = num / 2;
            int y = num % 2;
            num = s;
            stringBuilder.append(y);
        }

        return stringBuilder.reverse().toString();
    }
}
