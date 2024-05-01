package pm.ww;

import java.util.*;

public class Test4 {
    public static void main(String[] args) {
        // 省和市
        // 需求：
        // 定义一个 Map 集合，键用表示省份名称 province，值表示市 city，但是市会有多个
        // 添加完毕后，遍历结果格式
        // 江苏省=南京市, 扬州市, 苏州市

        Map<String, LinkedHashSet<String>> map = new HashMap<>();
        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        Collections.addAll(set1, "南京市", "苏州市", "盐城市");
        map.put("江苏省", set1);
        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.add("武汉市");
        set2.add("黄石市");
        set2.add("恩施市");
        map.put("湖北省", set2);

        map.forEach((key, val) -> {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(key).append("=");

            StringJoiner stringJoiner = new StringJoiner(", ");
            for (String s : val) {
                stringJoiner.add(s);
            }

            System.out.println(stringBuilder.append(stringJoiner));
        });
    }
}
