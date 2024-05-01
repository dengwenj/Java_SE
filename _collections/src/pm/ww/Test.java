package pm.ww;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "王小波", "王阳明", "朴睦", "你好", "世界", "韩梅梅");
        System.out.println(list); // [朴睦, 你好, 世界, 韩梅梅, 王小波, 王阳明]

        // 打乱顺序
        //Collections.shuffle(list);

        // 排序, 根据字符串的长度排序
        //Collections.sort(list, (o1, o2) -> o1.length() - o2.length());
        //System.out.println(list);

        // 拷贝集合中的元素
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("哈哈哈");
        Collections.copy(list, list1);
        System.out.println(list); // [哈哈哈, 王阳明, 朴睦, 你好, 世界, 韩梅梅]

        // 使用指定的元素填充集合
        //Collections.fill(list, "ww");
        //System.out.println(list); // [ww, ww, ww, ww, ww, ww]

        // 交换集合中指定位置的元素
        Collections.swap(list, 0, 1);
        System.out.println(list); // [王阳明, 哈哈哈, 朴睦, 你好, 世界, 韩梅梅]
    }
}
