package pm.anli;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // 数据过滤
        // 定义一个集合，并添加一些整数
        // 过滤奇数，只留下偶数
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> filterList = list.stream()
            .filter((item) -> item % 2 == 0)
            .toList();
        System.out.println(filterList); // [2, 4, 6, 8, 10]
    }
}
