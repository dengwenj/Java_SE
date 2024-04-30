package pm.anli2;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        // 统计投票人数
        // 需求：
        // 某个班级 80 名学生，现在需要组成秋游活动，班长提供了四个景点依次是（A、B、C、D）
        // 每个学生只能选择一个景点，请统计出最终哪个景点想去的人数最多
        char[] arr = {'A', 'B', 'C', 'D'};
        Random r = new Random();
        Map<Student, Character> map = new HashMap<>();
        // 每个同学的投票
        for (int i = 0; i < 80; i++) {
            int idx = r.nextInt(arr.length);
            map.put(new Student("朴睦" + i, i), arr[idx]);
        }
        Set<Map.Entry<Student, Character>> entries = map.entrySet();

        // 景点投了多少次
        Map<Character, Integer> map1 = new HashMap<>();

        for (Map.Entry<Student, Character> entry : entries) {
            char value = entry.getValue();

            // 存在， containsKey 判断 key 是否存在
            if (map1.containsKey(value)) {
                Integer integer = map1.get(value);
                // 重复会覆盖
                map1.put(value, ++integer);
            } else {
                map1.put(value, 1);
            }
        }
        System.out.println(map1);
        System.out.println("--------------");

        int max = 0;
        char c = 'A';
        Set<Character> characters = map1.keySet();
        for (char c1 : characters) {
            int value = map1.get(c1);
            if (value > max) {
                max = value;
                c = c1;
            }
        }
        System.out.println(max);
        System.out.println(c);
    }
}