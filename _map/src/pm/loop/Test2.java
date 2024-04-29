package pm.loop;

import java.util.HashMap;
import java.util.Map;

public class Test2 {
    public static void main(String[] args) {
        // lambda 遍历
        Map<String, String> map = new HashMap<>();
        map.put("name", "朴睦");
        map.put("你好", "世界");
        map.put("王小波", "李银河");

        map.forEach((key, val) -> {
            System.out.println(key + ": " + val);
        });
    }
}
