package vip.dengwj.regex;

public class Test5 {
    public static void main(String[] args) {
        // 捕获分组
        // a123a    b456b   a123b
        // \\组号：表示把第x组的内容再出来用一次
        String regex1 = "(.).+\\1";
        System.out.println("a123a".matches(regex1)); // true
        System.out.println("b456b".matches(regex1)); // true
        System.out.println("a123b".matches(regex1)); // false

        // abc123abc   bcd123bcd   qwe123rew
        String regex2 = "(.+).+\\1";
        System.out.println("abc123abc".matches(regex2)); // true
        System.out.println("bcd123bcd".matches(regex2)); // true
        System.out.println("qwe123rew".matches(regex2)); // false

        // aaa123aaa   bbb123bbb   ccc123ddd
        String regex3 = "((.)\\2*).+\\1";
        System.out.println("aaa123aaa".matches(regex3)); // true
        System.out.println("bbb123bbb".matches(regex3)); // true
        System.out.println("ccc123ddd".matches(regex3)); // false

        System.out.println("---------------");

        String str = "我要学学编编编编程程程程程程";
        String res = str.replaceAll("(.)\\1+", "$1");
        System.out.println(res); // 我要学编程
    }
}
