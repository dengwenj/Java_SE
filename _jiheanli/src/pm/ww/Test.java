package pm.ww;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        // 班级里有 n 个学生，实现随机点名器
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "朴睦", "李雷", "韩梅梅", "王小波", "王阳明", "苏轼", "苏辙", "苏洵");
        //Random random = new Random();
        //int i = random.nextInt(list.size());
        //System.out.println(list.get(i));
        Collections.shuffle(list);
        System.out.println(list.get(0));
    }
}
