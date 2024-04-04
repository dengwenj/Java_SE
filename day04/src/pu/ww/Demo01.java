package pu.ww;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期");
        int week = sc.nextInt();
        switch (week) {
            case 1:
                System.out.println("err");
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            default:
                System.out.println("default");
                break;
        }

        // switch 新特性 jdk12
        switch(week) {
            case 1 -> {
                System.out.println("我有两行语句体");
                System.out.println("我是一");
            }
            case 2 -> System.out.println("我是语句体2");
            default -> System.out.println("default");
        }
    }
}
