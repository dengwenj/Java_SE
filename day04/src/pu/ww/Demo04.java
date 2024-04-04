package pu.ww;

public class Demo04 {
    public static void main(String[] args) {
        // 回文数 121
        int num = 121;
        int temp = num;
        int num1 = 0;
        while(num != 0) {
            // 从右往左获取每一位数字
            int ge = num % 10;
            // 修改一下 x 记录的值
            num = num / 10; // 整数相除得到的是整数
            // 把当前获取到的数字拼接到最右边
            num1 = num1 * 10 + ge;
        }
        System.out.println(temp == num1);


        // 给定两个整数，被除数和除数，不能使用乘法、除法、%运算符，求出商和余数
        // 被除数 / 除数 = 商......余数
        int a = 100;
        int b = 30;
        // 商
        int count = 0;
        // a < b 说明余数就是 a
        while(a >= b) {
            a = a - b;
            count++;
        }
        System.out.println("商" + count);
        System.out.println("余数" + a);
    }
}
