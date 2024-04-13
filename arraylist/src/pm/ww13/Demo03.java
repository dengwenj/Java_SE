package pm.ww13;

import java.util.ArrayList;

public class Demo03 {
    public static void main(String[] args) {
        // 创建基本数据类型集合的对象，先把转成包装类
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        ArrayList<Character> list1 = new ArrayList<>();
        list1.add('a');
        list1.add('b');
        list1.add('c');

        System.out.println(list1);
    }
}
