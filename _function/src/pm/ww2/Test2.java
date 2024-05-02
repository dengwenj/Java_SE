package pm.ww2;

import java.util.ArrayList;
import java.util.Collections;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张三", "李四", "张拉拉", "张晓波");

        list.stream()
            .filter(new StringOperation()::stringJudge)
            .forEach(System.out::println); // 张拉拉 张晓波
    }
}
