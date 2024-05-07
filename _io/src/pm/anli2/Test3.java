package pm.anli2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test3 {
    public static void main(String[] args) throws IOException {
        // 需求：
        // 一个文件里面存储了编辑同学的信息，每一个学生信息占一行
        // 格式：张三-男-23
        // 要求通过程序实现随机点名器
        // 70% 的概率随机到男生，30%的概率随机到女生
        // 1代表男，0代表女
        ArrayList<Integer> bg = new ArrayList<>();
        Collections.addAll(bg, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0);
        // 打乱
        Collections.shuffle(bg);

        Random r = new Random();

        // 读取文件
        BufferedReader br = new BufferedReader(new FileReader("_io/src/pm/anli2/name.txt"));

        ArrayList<String> list1 = new ArrayList<>();
        String str;
        while ((str = br.readLine()) != null) {
            list1.add(str);
        }

        ArrayList<String> body = new ArrayList<>();
        ArrayList<String> girl = new ArrayList<>();

        for (String s : list1) {
            if (s.split("-")[1].equals("男")) {
                body.add(s);
            } else {
                girl.add(s);
            }
        }

        int bCount = 0;
        int gCount = 0;
        for (int i = 0; i < 100000; i++) {
            int index = r.nextInt(bg.size());
            // 男还是女
            int bgInt = bg.get(index);

            // 从男生里面拿
            if (bgInt == 1) {
                // 点名
                int idx = r.nextInt(body.size());
                String s = body.get(idx);
                bCount++;
            } else if (bgInt == 0) {
                // 从女生里面拿
                // 点名
                int idx = r.nextInt(girl.size());
                String s = girl.get(idx);
                gCount++;
            }
        }
        System.out.println("男：" + bCount);
        System.out.println("女：" + gCount);
    }
}
