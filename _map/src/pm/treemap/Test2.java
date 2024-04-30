package pm.treemap;

import java.util.TreeMap;

public class Test2 {
    public static void main(String[] args) {
        // 统计个数
        // 需求：字符串 "eaababcabcdabcd"
        // 请统计字符串中每一个字符出现的次数，并按照一下格式输出
        // a(5)b(4)c(3)d(2)e(1)

        String str = "eaababcabcdabcd";
        TreeMap<Character, Integer> tm = new TreeMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // 存在该键
            if (tm.containsKey(c)) {
                int val = tm.get(c);
                tm.put(c, ++val);
            } else {
                tm.put(c, 1);
            }
        }
        System.out.println(tm); // {a=5, b=4, c=3, d=2, e=1}

        StringBuffer stringBuffer = new StringBuffer();
        tm.forEach((key, val) -> {
            stringBuffer.append(key).append("(").append(val).append(") ");
        });
        System.out.println(stringBuffer);
    }
}
