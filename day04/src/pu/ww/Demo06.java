package pu.ww;

import java.util.Random;
import java.util.Scanner;

public class Demo06 {
    public static void main(String[] args) {
        // 逢 7 过
        for (int i = 0; i < 100; i++) {
            if (i % 7 == 0 || i % 10 == 7 || i / 10 == 7) {
                continue;
            }
            System.out.println(i);
        }

        // 输入一个大于或等于2的整数 求平方根
        // 1 * 1 < 20
        // 2 * 2 < 20
        // 3 * 3 < 20
        // 4 * 4 < 20
        // 5 * 5 > 20
        int num = 20;
        int count = 1;
        int val = count;
        while (count * count <= num) {
            val = count++;
        }
        System.out.println(val);

        // 质数：如果一个整数只能被 1 和本身整除，那么这个数就是质数, 如果除以其他数得到整数就不是质数
        int num2 = 23;
        // 写一个循环，从 2 开始判断，一直判断到 num2 - 1 为止
        // 看这个范围之内，有没有数字可以被 num2 整除的
        boolean flag = true;
        for (int i = 2; i < num2; i++) {
            // 能被整除说明不是质数
            if (num2 % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("是一个质数" + num2);
        } else {
            System.out.println("不是一个质数" + num2);
        }

        // 用平方根的方式更加简洁，复杂度更小
        /*int num3 = 100;
        // 如果这个范围之内，所有的数字都不能被 num3 整除，那么 num3 就是一个质数
        for (int i = 2; i <= num3的平方根; i++) {}*/

        // 自动生成一个 1- 100 之间的随机数字，使用程序实现猜出这个数字是多少
        Random r = new Random();
        int n = r.nextInt(100) + 1; // 1- 100 之间
        Scanner sc = new Scanner(System.in);

        int count1 = 0;
        while (true) {
            System.out.println("请猜这个数是多少");
            int s = sc.nextInt();

            count1++;
            System.out.println(count1 + "count1");
            if (count1 == 3) {
                System.out.println("猜对了" + n);
                break;
            }

            if (s > n) {
                System.out.println("猜大了");
            } else if (s < n) {
                System.out.println("猜小了");
            } else {
                System.out.println("猜对了");
                break;
            }
        }
    }
}
