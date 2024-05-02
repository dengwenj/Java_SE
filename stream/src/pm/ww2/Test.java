package pm.ww2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "你好", "你不好", "你很好", "世界");

        List<String> list1 = list.stream().filter((item) -> item.startsWith("你")).toList();
        System.out.println(list1); // [你好, 你不好, 你很好]
        System.out.println("-----------------");

        // 获取前几个元素
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "苏轼", "苏辙", "苏洵", "王阳明", "朴睦", "余华", "王小波", "莫言", "陈丹青", "王朔");
        list2.stream().limit(3).forEach((item) -> System.out.println(item));
        System.out.println("-----------------");

        // 跳过前几个元素
        list2.stream().skip(5).forEach((item) -> System.out.println(item));
        System.out.println("-----------------");

        // 元素去重
        ArrayList<String> list3 = new ArrayList<>();
        Collections.addAll(list3, "朴睦", "朴睦", "韩妹妹", "李雷");
        list3.stream().distinct().forEach((item) -> System.out.println(item));
        System.out.println("-----------------");

        // 合并 a 和 b 两个流为一个流
        Stream.concat(list1.stream(), list2.stream()).forEach((item) -> System.out.println(item));
        System.out.println("-----------------");

        // map进行一些转换
        ArrayList<String> list4 = new ArrayList<>();
        Collections.addAll(list4, "朴睦-24", "韩妹妹-18", "李雷-20");
        list4.stream().map((item) -> Integer.parseInt(item.split("-")[1])).forEach((item) -> System.out.println(item));
    }
}
