package pm.ww;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // 新增
        list.add("朴睦");
        list.add("李雷");
        list.add("韩梅梅");
        list.add(1, "王小波");
        System.out.println(list); // [朴睦, 王小波, 李雷, 韩梅梅]

        // 删除指定索引处的元素，返回被删除的元素
        list.remove(1); // 王小波
        System.out.println(list); // [朴睦, 李雷, 韩梅梅]

        // 修改指定索引处的元素，返回被修改的元素
        list.set(2, "玛丽"); // 韩梅梅
        System.out.println(list);

        // 获取指定索引处的元素
        System.out.println(list.get(0)); // 朴睦
        System.out.println(list.get(1)); // 李雷
    }
}
