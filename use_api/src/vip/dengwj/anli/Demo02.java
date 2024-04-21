package vip.dengwj.anli;

public class Demo02 {
    public static void main(String[] args) {
        // 实现 parseInt 方法的效果，将字符串形式的数据转成整数
        // 字符串只能是数字不能有其他字符
        // 最少一位，做多10位，0不能开头
        int num = myParseInt("-122211");
        System.out.println(num + 1);
    }

    public static int myParseInt(String s) {
        String str = s;
        boolean burden = false;
        // 负数
        if (s.charAt(0) == '-') {
             str = s.substring(1);
            burden = true;
        }

        String regex = "[^0][0-9]{0,9}";
        boolean matches = str.matches(regex);

        if (!matches) {
            throw new RuntimeException("不符合规则");
        }

        // 查表法
        int[] arr = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

        int len = str.length();
        int res = 0;
        for (int i = 0; i < len; i++) {
            int unit = len - i - 1;
            char c = str.charAt(i);
            int num = (c - '0') * arr[unit];
            res += num;

            // 这样就可以不用查表法了
            // res = res * 10 + c;
        }

        return burden ? -res : res;
    }
}
