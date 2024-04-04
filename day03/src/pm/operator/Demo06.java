package pm.operator;

import java.util.Scanner;

public class Demo06 {
    public static void main(String[] args) {
        // 短路逻辑运算符 && ||
        System.out.println(false && false); // false
        System.out.println(false && true); // false
        System.out.println(true && true); // true
        System.out.println(true && false); // false

        System.out.println(false || false); // false
        System.out.println(false || true); // true
        System.out.println(true || false); // true
        System.out.println(true || true); // true

        // 短路逻辑运算符具有短路效果
        // 当左边的表达式能确定最终的结果，那么右边就不会参与运行了
        int num1 = 10;
        int num2 = 20;
        boolean res = ++num1 > 100 && ++num2 > 200;
        System.out.println(res); // false
        System.out.println(num1); // 11
        System.out.println(num2); // 20

        // 练习：
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int num3 = sc.nextInt();
        System.out.println("请输入第二输");
        int num4 = sc.nextInt();
        boolean res1 = num3 == 6 || num4 == 6 || (num3 + num4) % 6 == 0;
        System.out.println(res1);
    }
}
