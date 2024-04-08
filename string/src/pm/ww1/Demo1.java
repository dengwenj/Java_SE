package pm.ww1;

public class Demo1 {
    public static void main(String[] args) {
        /*
         * 字符串不可变，他们的值在创建后不能被更改！！！！！！！
         * 这种不是改变了字符串的内容，而是创建了一个新的字符串，把新的字符串再赋值给了前面的变量 name，
         * 此时并没有改变第一个字符串 "朴睦" 里面的内容
         */
        String name = "朴睦";
        name = "李雷";
        System.out.println(name);

        // 字符串不可变，他们的值在创建后不能被更改！！！！！！！
        String n1 = "你好";
        System.out.println(n1); // 你好
        String n2 = n1;
        n2 = "世界";
        System.out.println(n1); // 你好
        System.out.println(n2); // 世界
    }
}
