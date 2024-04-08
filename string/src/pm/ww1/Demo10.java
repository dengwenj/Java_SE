package pm.ww1;

import java.util.Scanner;

public class Demo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 手机号隐藏一部分
        /*
        System.out.println("请输入手机号");
        String phone = sc.next();

        String start = phone.substring(0, 3);
        String end = phone.substring(7);

        System.out.println(start + "****" + end);*/

        // 身份证信息查看
        // 取出出生年、月、日(7-14位)
        // 性别(奇数是男，偶数是女, 17位)
        String sfz = sc.next();
        String info = sfz.substring(6, 14);
        String sex = sfz.substring(16, 17);
        String cs = info.substring(0, 4);
        String month = info.substring(4, 6);
        String day = info.substring(6);
        System.out.println(cs + "年" + month + "月" + day + "日");
        // ASCII 码 48 的值是 0
        System.out.println(((int) sex.charAt(0) - 48));
        if (((int) sex.charAt(0) - 48) % 2 == 0) {
            System.out.println("女");
        } else {
            System.out.println("男");
        }
    }
}
