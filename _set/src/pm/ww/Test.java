package pm.ww;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set<String> sets = new HashSet<>();

        sets.add("朴睦");
        sets.add("朴睦");
        sets.add("李雷");
        sets.add("韩梅梅");
        System.out.println(sets); // [李雷, 朴睦] 无序的
        System.out.println("------------");

        boolean b = sets.remove("李雷");
        System.out.println(b);
        System.out.println(sets);
        System.out.println("------------");

        boolean empty = sets.isEmpty();
        System.out.println(empty); // false

        // 迭代器遍历
        Iterator<String> iterator = sets.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
        System.out.println("-------");

        // 增强 for 遍历
        for (String s : sets) {
            System.out.println(s);
        }
        System.out.println("-------");

        // lambda
        sets.forEach((s) -> {
            System.out.println(s);
        });
    }
}
