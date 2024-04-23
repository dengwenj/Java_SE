package pm.ww;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Loop {
    public static void main(String[] args) {
        // 迭代器遍历
        Collection<String> coll = new ArrayList<>();
        coll.add("朴睦");
        coll.add("李雷");
        coll.add("韩梅梅");

        // 获取迭代器对象
        Iterator<String> iterator = coll.iterator();
        // 判断当前元素是否有值
        while (iterator.hasNext()) {
            // 获取当前元素，并将指针向后移动一个
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
