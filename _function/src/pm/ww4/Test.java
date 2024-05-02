package pm.ww4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // 使用类名引用成员方法
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "abc", "cba", "bcd");

        List<String> list1 = list.stream()
            .map(String::toUpperCase)
            .toList();
        System.out.println(list1); // [ABC, CBA, BCD]
    }
}
