package pm.ww5;

import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        // 需求：选择比较器排序和自然排序两种方式
        // 要求：存入四个字符串, "c" "ab" "df" "qwer"
        // 按照长度排序，如果一样长则按照首字母排序
        TreeSet<String> ts = new TreeSet<>((o1, o2) -> {
            int i = o1.length() - o2.length();
            i = i == 0 ? o1.compareTo(o2) : i;
            return i;
        });

        ts.add("ab");
        ts.add("c");
        ts.add("df");
        ts.add("qwer");

        System.out.println(ts); // [c, ab, df, qwer]
    }
}
