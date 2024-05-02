package pm.ww5;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4);

        // list.stream().toArray((val) -> new Integer[val]);
        // 引用数组的构造方法
        list.toArray(Integer[]::new);
    }
}
