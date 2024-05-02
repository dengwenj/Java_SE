package pm.anli;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Demo3 {
    public static void main(String[] args) {
        // 现在有两个 ArrayList 集合
        // 第一个集合中：存储6名男演员的名字和年龄。第二个集合中：存储6名女演员的名字和年龄
        // 1、男演员只要名字为3个字的前两人
        // 2、女演员只要姓杨的，并且不要第一个
        // 3、把过滤后的男演员姓名和女演员姓名合并到一起
        // 4、将上一步的演员信息封装成 Actor 对象
        // 5、将所有的演员对象都保存到list集合中

        ArrayList<String> boy = new ArrayList<>();
        Collections.addAll(boy, "杜子建,23", "阳明,18", "朴睦,24", "杨一封,30", "陈巴子,40");
        ArrayList<String> girl = new ArrayList<>();
        Collections.addAll(girl, "杨依依,20", "王红红,30", "杨珊珊,25", "白柚,33", "右婷,21");

        Stream<String> stream1 = boy.stream()
            .filter((item) -> item.split(",")[0].length() == 3)
            .limit(2);

        Stream<String> stream2 = girl.stream()
            .filter((item) -> item.split(",")[0].startsWith("杨"))
            .skip(1);

        List<Actor> actors = Stream.concat(stream1, stream2)
            .map((item) -> {
                String[] split = item.split(",");
                return new Actor(split[0], Integer.parseInt(split[1]));
            })
            .toList();

        // [Actor{name = 杜子建, age = 23}, Actor{name = 杨一封, age = 30}, Actor{name = 杨珊珊, age = 25}]
        System.out.println(actors);
    }
}
