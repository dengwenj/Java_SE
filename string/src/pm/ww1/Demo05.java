package pm.ww1;

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        // 遍历字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}
