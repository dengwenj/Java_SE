package pm.ww;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        // 班级有 n 个学生
        // 要求：
        // 70% 的概率随机到男生
        // 30% 的概率随机到女生
        ArrayList<String> boyList = new ArrayList<>();
        ArrayList<String> girlList = new ArrayList<>();

        Collections.addAll(boyList, "朴睦", "宋合泛", "张德帅", "王阳明", "王小波");
        Collections.addAll(girlList, "妮妮", "玛丽", "韩梅梅", "小芳");

        // 1 代表男，0代表女
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 1, 1, 1, 1, 1, 1);
        Collections.addAll(list, 0, 0 ,0);
        // 打乱 list
        Collections.shuffle(list);
        Random r = new Random();
        int i = r.nextInt(list.size());
        int boyOrGirl = list.get(i);
        System.out.println(boyOrGirl);

        // 男
        if (boyOrGirl == 1) {
            int i1 = r.nextInt(boyList.size());
            System.out.println(boyList.get(i1));
        } else {
            // 女
            int i1 = r.nextInt(girlList.size());
            System.out.println(girlList.get(i1));
        }
    }
}
