package vip.dengwj.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test3 {
    public static void main(String[] args) {
        String str = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";
        // 获取正则表达式对象
        Pattern p = Pattern.compile("(Java\\d{0,2})|(\\d+)");
        // 获取文本匹配器的对象，拿着 matcher 去读取 str，找符合 p 规则的子串
        Matcher matcher = p.matcher(str);

        while(matcher.find()) {
            String group = matcher.group();
            System.out.println(group);
//            Java
//            95
//            Java8
//                Java11
//            Java17
//                Java17
        }
    }
}
