package pm.ww;

import java.util.*;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {
        // 单列集合 Stream
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "朴睦", "王小波", "王阳明");

        list.stream().forEach((item) -> {
            System.out.println(item);
        });

        System.out.println("-------------------");

        // 双列集合
        HashMap<String, String> hm = new HashMap<>();
        hm.put("你好", "世界");
        hm.put("朴睦", "王阳明");
        Set<String> strings = hm.keySet();
        Stream<String> stringStream = strings.stream().map((key) -> {
            return key + "map";
        });
        System.out.println(stringStream.toList());

        System.out.println("------------------");

        // 数组
        String[] strs = {"你好", "我的世界", "pp"};
        Arrays.stream(strs).forEach((item) -> System.out.println(item));
        System.out.println("-------------");

        // 零散数据
        Stream.of(1, 2, 3).forEach((num) -> System.out.println(num));
        Stream.of(strs).forEach((s) -> System.out.println(s));
    }
}
