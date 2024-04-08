package pm.ww1;

import java.util.Scanner;

public class Demo09 {
    public static void main(String[] args) {
        // 金额转换 -> 查表法
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入金额");

        int amount;
        while (true) {
            int num = sc.nextInt();
            if (num > 0 && num <= 9999999) {
                amount = num;
                break;
            } else {
                System.out.println("金额无效");
            }
        }

        // 数字转成大写
        String bA = bigAmount(amount);
        // 大写前面补零
        String zeroBA = beforeZeroPadding(bA, 7);
        // 加上单位
        String formatAmount = addUnit(zeroBA);
        System.out.println(formatAmount);
    }

    // 数字转成大写
    public static String bigAmount(int amount) {
        // 通过查表法
        String[] bAs = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};

        String bA = "";
        // 数字转成大写
        while (amount != 0) {
            int ge = amount % 10;
            amount = amount / 10;
            // 把 bA 加在后面就可以不用反转了
            bA = bAs[ge] + bA;
        }

        return bA;
    }

    // 前面补零
    public static String beforeZeroPadding(String str, int total) {
        // 补多少个 0
        int zeros = total - str.length();
        if (zeros <= 0) {
            return str;
        }

        for (int i = 0; i < zeros; i++) {
            str = "零" + str;
        }

        return str;
    }

    // 加上大写单位
    public static String addUnit(String str) {
        // 插入单位 查表法
        String[] units = {"元", "拾", "佰", "千", "万", "拾", "佰", "千", "亿", "拾", "佰", "千", "万"};

        String res = "";
        int l = str.length();
        for (int i = 0; i < l; i++) {
            res += str.charAt(i) + units[l - 1 - i];
        }

        return  res;
    }
}
