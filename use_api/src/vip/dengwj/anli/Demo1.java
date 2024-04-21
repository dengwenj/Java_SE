package vip.dengwj.anli;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        // 键盘录入一些 1-100 之间的整数，并添加到集合中
        // 直到集合中所有数据和超过 200 为止
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        loop:
        while (true) {
            System.out.println("请输入整数");
            int num = sc.nextInt();
            list.add(num);
            int sum = 0;
            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i);
                System.out.println(sum);
                if (sum >= 200) {
                    break loop;
                }
            }
        }
    }
}
