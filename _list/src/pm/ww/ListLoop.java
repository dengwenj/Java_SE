package pm.ww;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListLoop {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("朴睦");
        list.add("李雷");
        list.add("韩梅梅");

        // 迭代器遍历
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
        System.out.println("----------");

        // 增强 for
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("----------");

        // lambda 表达式
        list.forEach((name) -> {
            System.out.println(name);
        });
        System.out.println("----------");

        // 普通 for 循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("----------");

        // 列表迭代器
        ListIterator<String> stringListIterator = list.listIterator();
        while (stringListIterator.hasNext()) {
            String next = stringListIterator.next();
            if ("李雷".equals(next)) {
                stringListIterator.add("王阳明");
            }
            System.out.println(next);
        }
        System.out.println(list);
    }
}
