package pm.ww;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        // 班级里有 5 个学生
        // 要求：
        // 被点到的学生不会再被点到
        // 但是如果班级中所有的学生都点完了，需要重新开启第二轮点名

        // 所有学生
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "朴睦", "王阳明", "苏轼", "陶渊明", "刘备");

        // 已经点过的学生
        ArrayList<String> list1 = new ArrayList<>();

        Random r = new Random();
        int size = list.size();

        for (int j = 1; j <= 2; j++) {
            System.out.println("----------------第" + j + "轮-----------------");
            while (list1.size() != size) {
                int i = r.nextInt(size);
                String s = list.get(i);

                boolean exit = isExit(list1, s);
                // 说明没找到
                if (!exit) {
                    list1.add(s);
                    System.out.println(s);
                }
            }
            list1.clear();
        }

    }

    public static boolean isExit(ArrayList<String> list, String key) {
        for (String s : list) {
            // 找打了
            if (s.equals(key)) {
                return true;
            }
        }
        return false;
    }
}
