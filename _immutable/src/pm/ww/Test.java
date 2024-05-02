package pm.ww;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        // 不可变集合
        ArrayList<String> list = new ArrayList<>();
        list.add("你好");
        list.add("世界");

        // 不可变集合
        List<String> list1 = List.of(list.toArray(new String[0]));
    }
}
