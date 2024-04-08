package pm.ww1;

public class Demo03 {
    public static void main(String[] args) {
        // 基本数据类型比较的是数据值
        // 引用数据类型比较的是地址值
        // 比较字符串是否一样
        String str1 = new String("abc");
        String str2 = "Abc";

        // 直接用 == 比较
        System.out.println(str1 == str2); // false 因为地址值不一样

        // 比较字符串对象中的内容是否相等
        // 用 equals 比较，不忽略大小写
        boolean b1 = str1.equals(str2);
        System.out.println(b1);
        // 忽略大小写
        boolean b2 = str1.equalsIgnoreCase(str2);
        System.out.println(b2);
    }
}
