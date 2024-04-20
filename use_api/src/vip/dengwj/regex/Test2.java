package vip.dengwj.regex;

public class Test2 {
    public static void main(String[] args) {
        // 校验手机号码
        // 校验邮箱号码
        // 校验电话号码

        // 手机号
        //System.out.println("13323456766".matches("1[\\d&&[^0124]]\\d{9}"));

        // 用户名 要求：大小写字母，数字，下划线一共4-16位
        String s1 = "\\w{4,16}";
        System.out.println("s33f".matches(s1));

        // 身份证
        String s2 = "\\d{17}[\\dxX]";
        // ?i 忽略大小写
        String s3 = "[1-9]\\d{16}(\\d|(?i)x)";
        System.out.println("12311111111111111X".matches(s2));
    }
}
