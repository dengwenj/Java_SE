package pm.ww;

import java.util.ArrayList;
import java.util.Collection;

public class collection {
    public static void main(String[] args) {
        // 多态
        Collection<String> coll = new ArrayList<>();

        // 添加
        // List 系列集合添加数据，永远返回 true（允许重复）
        // Set 系列集合添加数据，如果当前要添加元素不存在，方法返回 true，添加的元素存在，方法返回 false（不允许重复）
        coll.add("朴睦");
        coll.add("李雷");
        coll.add("王小波");
        System.out.println(coll);

        // 清空
        //coll.clear();
        System.out.println(coll);

        // 删除
        System.out.println(coll.remove("李银河")); // false 因为没有该元素
        coll.add("王阳明");
        System.out.println(coll.remove("王阳明")); // true

        // 判断是否包含
        // 底层是依赖 equals 方法进行判断是否存在的
        // 如果集合中存储的是自定义对象，也想通过 contains 方法来判断是否包含，那么在 javabean 类中，一定要重写 equals 方法
        System.out.println(coll.contains("朴睦")); // true

        // 判断是否为空
        System.out.println(coll.isEmpty()); // false

        // 集合长度
        System.out.println(coll.size()); // 3
    }
}
