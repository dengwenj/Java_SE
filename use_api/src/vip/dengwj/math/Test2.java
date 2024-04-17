package vip.dengwj.math;

public class Test2 {
    public static void main(String[] args) {
        // System.out.println(isZS(997)); // true 是质数

        // 自幂数，一个 n 位自然数等于自身各个数位上数字的 n 次幂之后
        // 水仙花数 三位数
        int count1 = 0;
        for (int i = 100; i <= 999 ; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;

            double sum = Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3);
            // 说明是水仙花数
            if (sum == i) {
                count1++;
                System.out.println(i);
            }
        }
        System.out.println(count1 + "个");
        System.out.println("------------");

        // 两位数没有自幂数
        int count2 = 0;
        for (int i = 10; i <= 99; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            double sum = Math.pow(ge, 2) + Math.pow(shi, 2);
            if (sum == i) {
                count2++;
                System.out.println(i);
            }
        }
        System.out.println(count2 + "个");
        System.out.println("-----------");

        // 四叶玫瑰数
        int count3 = 0;
        for (int i = 1000; i <= 9999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            int qian = i / 1000 % 10;
            double sum = Math.pow(ge, 4) + Math.pow(shi, 4) + Math.pow(bai, 4) + Math.pow(qian, 4);
            if (sum == i) {
                count3++;
                System.out.println(i);
            }
        }
        System.out.println(count3 + "个");
        System.out.println("-----------");

        // 五角星数
        int count4 = 0;
        for (int i = 10000; i <= 99999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            int qian = i / 1000 % 10;
            int wan = i / 10000 % 10;
            double sum = Math.pow(ge, 5) + Math.pow(shi, 5) + Math.pow(bai, 5) + Math.pow(qian, 5) + Math.pow(wan, 5);
            if (sum == i) {
                count4++;
                System.out.println(i);
            }
        }
        System.out.println(count4 + "个");
    }

    public static boolean isZS(int num) {
        // 判断是否是质数 997
        for (int i = 2; i < num; i++) {
            if (i % Math.sqrt(num) == 0) {
                return false;
            }
        }
        return true;
    }
}
