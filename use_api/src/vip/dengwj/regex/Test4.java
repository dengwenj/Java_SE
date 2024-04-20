package vip.dengwj.regex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test4 {
    public static void main(String[] args) {
        String str = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，因为这两个是长期支持版本，" +
            "下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";

        // ? 理解为前面的数据 Java
        // = 表示在Java后面要跟随的数据
        // 但是在获取的时候，只获取前半部分
        // 需求1 爬取版本号为8，11，17的java版本，但只要java，不显示版本号
        String regex1 = "((?i)Java)(?=8|11|17)";
        // 需求2 爬取版本号为8，11，17的java版本
        String regex2 = "((?i)Java)(8|11|17)";
        String regex3 = "((?i)Java)(?:8|11|17)";
        // 需求3 爬取除了版本号为8，11，17的java版本
        String regex4 = "((?i)Java)(?!8|11|17)";

        Pattern p = Pattern.compile(regex4);
        Matcher matcher = p.matcher(str);

        while (matcher.find()) {
            String group = matcher.group();
            System.out.println(group);
        }

        String str1 = "你好uqqu12世界uqqu12哈哈";
        String vs = str1.replaceAll("[\\w&&[^_]]+", "vs");
        String[] split = vs.split("[\\w&&[^_]]+");
        System.out.println(Arrays.toString(split)); // [你好, 世界, 哈哈]
    }
}
