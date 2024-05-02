package pm.ww4;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        // collect(Collector collector) 收集流中的数据，放到集合中（List、Set、Map）
        // 注意点：如果我们要收集到 Map 集合中，键不能重复，否则会报错
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "朴睦-男-24", "韩梅梅-女-18", "李雷-男-20");

        // List
        List<String> collect = list.stream()
            .filter((item) -> "男".equals(item.split("-")[1]))
            .collect(Collectors.toList());
        System.out.println(collect); // [朴睦-男-24, 李雷-男-20]

        // Set
        Set<String> collect1 = list.stream()
            .filter((item) -> "男".equals(item.split("-")[1]))
            .collect(Collectors.toSet());
        System.out.println(collect1); // [李雷-男-20, 朴睦-男-24]

        // Map
        Map<String, String> collect2 = list.stream()
            .filter((item) -> "男".equals(item.split("-")[1]))
            .collect(Collectors.toMap(
                (s) -> s.split("-")[0],
                (s) -> s.split("-")[2]
            ));
        System.out.println(collect2); // {李雷=20, 朴睦=24}
    }
}
