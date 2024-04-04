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
        switch (week) {
            case 1 -> {
                System.out.println("我有两行语句体");
                System.out.println("我是一");
            }
            case 2 -> System.out.println("我是语句体2");
            default -> System.out.println("default");
        }

        // 星期一到星期五是工作日，星期六星期天是休息日（可以用 case 穿透）
        int w = 1;
        switch (w) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("工作日");
                break;
            case 6:
            case 7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("没有这个");
                break;
        }

        // switch 新特性写法
        switch (w) {
            case 1, 2, 3, 4, 5 -> System.out.println("工作日");
            case 6, 7 -> System.out.println("休息日");
            default -> System.out.println("没有这个");

        }
    }
}
