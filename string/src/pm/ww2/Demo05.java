package pm.ww2;

import java.util.Scanner;
import java.util.StringJoiner;

public class Demo05 {
    public static void main(String[] args) {
        // 转换罗马数字
        // 输入长度小于等于 9
        Scanner sc = new Scanner(System.in);

        String str;
        do {
            System.out.println("输入一个长度小于等于9的数字");
            str = sc.next();
            // 不只是数字和长度大于9
        } while (!checkStr(str));

        String strLm = strToLm(str);
        System.out.println(strLm);
    }

    public static boolean checkStr(String str) {
        if (str.length() > 9) {
            return false;
        }

        // 只能是数字
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char num = str.charAt(i);
            if (num >= '0' && num <= '9') {
                count++;
            }
        }
        // false 说明不只是数字，有其他，true 只是数字
        return count == str.length();
    }

    public static String strToLm(String str) {
        StringJoiner sj = new StringJoiner("、");
        String[] arr = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        for (int i = 0; i < str.length(); i++) {
            // 得到输入的数
            int num = (int) str.charAt(i) - 48;
            if (num != 0) {
                sj.add(new StringBuilder(arr[num]).append("-").append(num));
            }
        }
        return sj.toString();
    }
}
