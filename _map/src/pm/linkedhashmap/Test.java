package pm.linkedhashmap;

import java.util.LinkedHashMap;

public class Test {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("c", 111);
        lhm.put("a", 222);
        lhm.put("a", 333);
        lhm.put("d", 444);

        System.out.println(lhm); // {c=111, a=333, d=444}
    }
}
