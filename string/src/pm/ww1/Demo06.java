package pm.ww1;

import java.util.Scanner;

public class Demo06 {
    public static void main(String[] args) {
        // 统计字符次数
        // 键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str = sc.next();

        int dCount = 0;
        int xCount = 0;
        int numCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // 找到字符对应的 ASCII 码表值
            // 小写字符
            if (c >= 97 && c <= 122) {
                xCount++;
                // 大写字符
            } else if (c >= 65 && c <= 90) {
                dCount++;
                // 数字字符
            } else if (c >= 48 && c <= 57) {
                numCount++;
            }

            // 也可以这样
            // char 类型的变量在参与计算的时候自动类型提升为 int 查询 ASCII 码表
            /*if (c >= 'a' && c <= 'z') {

            } else if (c >= 'A' && c <= 'Z') {

            } else if (c >= '0' && c <= '9') {

            }*/
        }
        System.out.printf("大写字符个数%s", dCount);
        System.out.println();
        System.out.printf("小写字符个数%s", xCount);
        System.out.println();
        System.out.printf("数字字符个数%s", numCount);
    }
}
