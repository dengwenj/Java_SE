package pm.anli;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo2 {
    public static void main(String[] args) {
        // 创建一个 ArrayList 集合，并添加以下字符串，字符串中前面是姓名，后面是年龄
        // "zhangsan,23" "lisi,24" "wangwu,25"
        // 保留年龄大于等于24岁的人，并将结果收集到 Map 集合中，姓名为键，年龄为值
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "zhangsan,23", "lisi,24", "wangwu,25");

        Map<String, Integer> collect = list.stream()
            .filter((item) -> Integer.parseInt(item.split(",")[1]) >= 24)
            .collect(Collectors.toMap(
                (item) -> item.split(",")[0],
                (item) -> Integer.parseInt(item.split(",")[1])
            ));
        System.out.println(collect); // {lisi=24, wangwu=25}
    }
}
