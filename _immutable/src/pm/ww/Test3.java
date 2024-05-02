package pm.ww;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test3 {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();

        hm.put("你好", "世界");
        hm.put("王小波", "李银河");
        hm.put("苏轼", "苏辙");

        Set<Map.Entry<String, String>> entries = hm.entrySet();

        Map<Object, Object> map = Map.ofEntries(entries.toArray(new Map.Entry[0]));

        Map<String, String> map1 = Map.of("1", "1val", "2", "2val");
    }
}
