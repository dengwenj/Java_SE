package pm.ww2;

public class Demo01 {
    public static void main(String[] args) {
        // 创建一个空白可变字符串对象，不含有任何内容
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1);

        // 根据字符串的内容，来创建可变字符串对象
        StringBuilder sb2 = new StringBuilder("朴睦");
        System.out.println(sb2);
        // 因为 StringBuilder 是 Java 已经写好的类
        // java 在底层对它做了一些特殊处理
        // 打印对象不是地址值而是属性值

        // 一些方法
        // 添加数据，并返回对象本身，StringBuilder 是可以修改内容的
        sb2.append("24");
        System.out.println(sb2); // 朴睦24

        // 反转容器中的内容
        sb2.reverse();
        System.out.println(sb2); // 42睦朴

        // 返回长度
        int len = sb2.length();
        System.out.println(len); // 4

        // 通过 toString() 就可以实现把 StringBuilder 转换成 String 类型
        String str = sb2.toString();
        System.out.println(str); // 42睦朴
    }
}
