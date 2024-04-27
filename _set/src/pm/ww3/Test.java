package pm.ww3;

import java.util.Iterator;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        // TreeSet，可排序
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(4);
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(2);
        treeSet.add(5);

        System.out.println(treeSet); // [1, 2, 3, 4, 5]

        // 遍历
        // 迭代器
        Iterator<Integer> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next);
        }
        System.out.println("----------");

        // 增强 for
        for (int i : treeSet) {
            System.out.println(i);
        }
        System.out.println("---------");

        // lambda
        treeSet.forEach((i) -> System.out.println(i));
    }
}
