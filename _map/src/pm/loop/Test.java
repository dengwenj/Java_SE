package pm.loop;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("name", "朴睦");
        map.put("你好", "世界");
        map.put("王小波", "李银河");

        // 通过键值对遍历
        Set<Map.Entry<String, String>> entries = map.entrySet();
        System.out.println(entries);

        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        System.out.println("-------------");

        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> next = iterator.next();
            System.out.println(next.getKey());
            System.out.println(next.getValue());
        }

        System.out.println("-----------");

        entries.forEach((entry) -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        });
     }
}
