package pm.anli2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) throws IOException {
        // 随机点名器
        // 需求：
        // 有一个文件里面存储了班级同学的信息，每一个信息占一行
        // 格式为：张三-男-23
        // 要求通过程序实现随机点名器

        // 先读取文件中的数据
        BufferedReader br = new BufferedReader(new FileReader("_io/src/pm/anli2/name.txt"));

        ArrayList<String> list = new ArrayList<>();
        String str;
        while ((str = br.readLine()) != null) {
            list.add(str);
        }
        br.close();

        Random r = new Random();
        int index = r.nextInt(list.size());
        String name = list.get(index).split("-")[0];
        System.out.println(name);
    }
}
