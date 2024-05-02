package pm.ww;

import java.util.HashSet;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();
        strings.add("你好");
        strings.add("世界");

        Set<String> strings1 = Set.of(strings.toArray(new String[0]));
        System.out.println(strings1);
    }
}
