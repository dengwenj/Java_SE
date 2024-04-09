package pm.ww;

import java.util.ArrayList;

public class Demo01 {
    public static void main(String[] args) {
        // 1、创建集合的对象
        // 泛型：限定集合中存储数据的类型
        // JDK7 以后可以省略后面泛型的类型只写<>
        ArrayList<String> list = new ArrayList<>();

        // 创建的是 ArrayList 的对象，而 ArrayList 是 java 已经写好的一个类
        // 这个类在底层做了一些处理
        // 打印对象不是地址值，而是集合中存储数据的内容
        // 在展示的时候会拿[]把所有的数据进行包裹
        // System.out.println(list); // []

        // 成员方法
        // 增 删 改 查 长度
        list.add("朴睦");
        list.add("韩梅梅");
        list.add("李雷");

        // boolean b = list.remove("李雷");
        // System.out.println(b); true

        //String s = list.remove(2);
        //System.out.println(s); // 李雷

        //String oldStr = list.set(2, "jack");
        //System.out.println(oldStr); // 李雷

        //String s = list.get(0); // 朴睦
        //System.out.println(s);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println(list);
    }
}
