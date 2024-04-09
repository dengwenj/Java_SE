package pm.ww2;

import java.util.Random;

public class Demo08 {
    public static void main(String[] args) {
        // 打乱字符串位置
        String str = "ABCDEFG";
        //System.out.println(dlStr(str));

        //System.out.println(str.charAt(1));

        // 生成验证码
        // 可以是大小写字母，也可以是数字
        // 长度为 5，内容中是四位字母，1位数字，数字可以在任何位置
        //System.out.println(code());

        // 字符串转成数字相乘
        // System.out.println(cj("111", "12"));

        // "Hello World" -> World 5
        // "  ff ww rqw hhh" -> hhh 3
        String k = kg("  ff ww rqw hhh");
        System.out.println(k);
        System.out.println(k.length());
    }

    public static String dlStr(String str) {
        // 转成字符数组
        char[] arr = str.toCharArray();

        // 从 0 索引开始，跟一个随机索引进行位置的交换
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int idx = r.nextInt(arr.length);
            char temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }

        return new String(arr);
    }

    public static String code() {
        // 查表法
        char[] zm = new char[52];
        for (int i = 0; i < zm.length; i++) {
            if (i < 26) {
                zm[i] = (char) (65 + i);
            } else {
                zm[i] = (char) (97 + i - 26);
            }
        }

        Random r = new Random();
        // 随机数字
        int num = r.nextInt(10);
        // 数字的位置
        int idx = r.nextInt(5);

        char[] chars = new char[5];
        for (int i = 0; i < chars.length; i++) {
            if (idx == i) {
                // 先数字转成字符串，然后拿到该字符
                chars[i] = (num + "").charAt(0);
            } else {
                int zmIdx = r.nextInt(zm.length);
                chars[i] = zm[zmIdx];
            }
        }

        return new String(chars);
    }

    public static String cj(String str1, String str2) {
        int n1 = stringToInt(str1);
        int n2 = stringToInt(str2);

        int n3 = n1 * n2;
        int temp = n3;
        int count = 0;
        while (n3 != 0) {
            n3 = n3 / 10;
            count++;
        }

        char[] arr = new char[count];
        int idx = 0;
        while (temp != 0) {
            char ge = (temp % 10 + "").charAt(0);
            temp = temp / 10;
            arr[arr.length - 1 - idx++] = ge;
        }
        return new String(arr);
    }

    public static int stringToInt(String str) {
        int n1 = 0;
        for (int i = 0; i < str.length(); i++) {
            int c = str.charAt(i);
            // 字符 48 对引是 0
            int num = c - 48;
            // 1 2 -> 12
            n1 = n1 * 10 + num;
        }
        return n1;
    }

    public static String kg(String str) {
        int idx = -1;
        for (int i = 0; i < str.length(); i++) {
            // 判断当前是否是空格，拿到最后一位
            if ((str.charAt(i) + "").equals(" ")) {
                idx = i;
            }
        }

        if (idx == -1) {
            return str;
        }

        return str.substring(idx + 1);
    }
}
