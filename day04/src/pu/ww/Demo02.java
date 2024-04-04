package pu.ww;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        // for 循环
        /*for(初始化语句; 条件判断语句; 条件控制语句) {
            循环体语句;
        }*/
        for (int i = 1; i <= 10; i++) {
            System.out.println("朴睦" + i);
        }

        // 求和
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("1-5之间的和:" + sum);

        int sum2 = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum2 += i;
            }
        }
        System.out.println(sum2);

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数字");
        int num2 = sc.nextInt();

        int pm = 0;
        for (int i = num1; i <= num2; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("是谁" + i);
                pm += 1;
            }
        }
        System.out.println("既能被3整除又能被5整除的个数有：" + pm);
    }
}
