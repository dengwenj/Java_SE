package pm.ww2;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        // 对称字符串
        // 键盘接收一个字符串，程序判断出该字符串时候是对称字符串，并在控制台打印是或不是
        // 123321 111、12321 非对称：12345
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        StringBuilder sb = new StringBuilder(str);
        String s2 = sb.reverse().toString();

        System.out.println(str.equals(s2));
    }
}
