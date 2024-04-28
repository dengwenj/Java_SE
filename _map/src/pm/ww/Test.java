package pm.ww;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        // map 遍历
        Map<String, String> map = new HashMap<>();

        map.put("name", "朴睦");
        map.put("hello", "世界");
        map.put("王小波", "李银河");

        // 获取所有的键，把这些键放到一个单列集合中
        Set<String> strings = map.keySet(); // 无序的
        for (String string : strings) {
            String s = map.get(string);
            System.out.println(s);
        }

        System.out.println("----------");

        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(map.get(next));
        }

        System.out.println("---------");

        strings.forEach((s) -> {
            System.out.println(map.get(s));
        });
    }
}
