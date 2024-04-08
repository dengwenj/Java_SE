package pm.ww1;

import java.util.Scanner;

public class Demo08 {
    public static void main(String[] args) {
        // 字符串反转
        // abc -> cba
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串，会将此字符串进行反转");
        System.out.println(reverse(sc.next()));
    }

    public static String reverse(String str) {
        String r = "";
        if (str.length() == 0) {
            return r;
        }

        for (int i = str.length() - 1; i >= 0; i--) {
            r += str.charAt(i);
        }
        return r;
    }
}
