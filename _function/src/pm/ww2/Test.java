package pm.ww2;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        // 引用静态方法

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "1", "2", "3", "4", "5", "6");

        list.stream()
            // 方法需要已经存在
            // 方法的形参和返回值需要跟抽象方法的形参和返回值保持一致
            // 方法的功能需要把形参的字符串转换成整数
            .map(Integer::parseInt)
            .forEach(System.out::println);
    }
}
