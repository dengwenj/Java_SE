package vip.dengwj.regex;

public class Test {
    public static void main(String[] args) {
        // public boolean matches(String regex): 判断是否与正则表达式匹配，匹配返回 true
        System.out.println("a".matches("[abc]")); // true
        System.out.println("bc".matches("[abc]")); // false  只匹配一个字符
        System.out.println("bc".matches("[abc][abc]")); // true

        System.out.println("------------");
        System.out.println("b".matches("\\w")); // true
        System.out.println("1".matches("\\d")); // true
        System.out.println(" ".matches("\\s")); // true
        // 数量词
        System.out.println("11".matches("[^0]\\w{2,}")); // true 至少两次
        System.out.println("211".matches("[^0]\\w{2,}")); // 不以 0 开头

        // \ 转义字符，改变后面那个字符原本的含义
    }
}
