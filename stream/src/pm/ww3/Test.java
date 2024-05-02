package pm.ww3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        // Stream 流的终结方法
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "你好", "世界", "朴睦");

        list.stream().forEach((item) -> System.out.println(item));
        System.out.println("--------------");

        long count = list.stream().count();
        System.out.println(count);
        System.out.println("--------------");

        // Object[] objects = list.stream().toArray();
        // toArray 方法的参数的作用：负责创建一个指定类型的数组
        // toArray 方法底层，会依次得到流里的每一个数据，并把数据放到数组当中
        // toArray 方法的返回值：是一个装着流里面所有数据的数组
        String[] strings = list.stream().toArray(val -> new String[val]);
        System.out.println(Arrays.toString(strings));
    }
}
