package test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        // 需求：键盘录入一个三位数，将其拆分为个位、十位、百位后，打印在控制台
        // 公式总结：
        // 个位：数值 % 10
        // 十位：数值 / 10 % 10
        // 百位：数值 / 100 % 10
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数数字");
        int num = sc.nextInt();
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100 % 10;
        System.out.println(ge);
        System.out.println(shi);
        System.out.println(bai);
    }
}
