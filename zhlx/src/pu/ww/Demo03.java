package pu.ww;

import java.util.Random;

public class Demo03 {
    public static void main(String[] args) {
        // 定义方法实现随机产生一个 5 位的验证码
        // 前四位是大写字母或者小写字母，最后一位是数字
        // String[] l = letter(new int[]{1, 2, 4}); 可以直接 new int[]{1, 2, 4} 传递 测试下
        char[] l = letter();
        Random r = new Random();
        // 随机取字母，取 4 次
        String code = "";
        for (int i = 0; i < 4; i++) {
            code += l[r.nextInt(l.length)];
        }
        int n = r.nextInt(10); // 不包含 10， 0 - 9
        System.out.println("验证码：" + code + n);
    }

    public static char[] letter() {
        // 在以后如果我们要在一堆没有什么规律的数据中随机抽取
        // 可以先把这些数据放到数组中，在随机抽取一个索引
        // A-Z a-z
        char[] l = new char[52];
        for (int i = 0; i < 52; i++) {
            if (i <= 25) {
                // 小写 a 对应 ASCII 码是 97
                // 数字强转成字符
                l[i] = (char) (97 + i);
            } else {
                // 大写
                // 减 26 因为前面小于等于 25 是小写
                l[i] = (char) (65 + i - 26);
            }
        }
        return l;
    }
}
