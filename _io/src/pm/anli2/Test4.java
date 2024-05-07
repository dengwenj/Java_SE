package pm.anli2;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Test4 {
    public static void main(String[] args) throws IOException {
        // 需求：
        // 一个文件里面存储了班级同学的姓名，每一个姓名占一行
        // 要求通过程序实现随机点名器
        // 第三次必定是张三同学
        BufferedReader br = new BufferedReader(new FileReader("_io/src/pm/anli2/name.txt"));

        ArrayList<String> list = new ArrayList<>();
        String str;
        while ((str = br.readLine()) != null) {
            list.add(str);
        }

        // 先读原来的
        BufferedReader br1 = new BufferedReader(new FileReader("_io/src/pm/anli2/count.txt"));
        String s = br1.readLine();
        br1.close();

        // 再写
        BufferedWriter bw = new BufferedWriter(new FileWriter("_io/src/pm/anli2/count.txt"));
        bw.write((Integer.parseInt(s) + 1) + "");
        bw.close();

        String name;
        // 输出指定的人
        if (Integer.parseInt(s) >= 2) { // 从 0 开始的
            name = list.get(0);
        } else {
            // 随机输出的人
            Random r = new Random();
            int index = r.nextInt(list.size());
            name = list.get(index);
        }

        System.out.println("第" + (Integer.parseInt(s) + 1) + "次运行：" + name);
    }
}
