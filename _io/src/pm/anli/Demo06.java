package pm.anli;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo06 {
    public static void main(String[] args) throws IOException {
        // 软件运行次数
        // 实现一个验证程序运行次数的小程序，要求入下：
        // 1、当程序运行超过3次时给出提示：本软件只能免费使用3次，欢迎您注册会员后继续使用
        // 2、程序运行演示如下：
        // 第一次运行控制台输出：欢迎使用本软件，第一次使用免费
        // 2 ...
        // 3 ...
        BufferedReader fr = new BufferedReader(new FileReader("_io/src/pm/anli/mianfei.txt"));
        FileWriter fw = null;

        int count = 0;
        String read;
        while ((read = fr.readLine()) != null) {
            fw = new FileWriter("_io/src/pm/anli/mianfei.txt");
            count = Integer.parseInt(read) + 1;

            if (count > 3) {
                fw.write(count + "");
                System.out.println("本软件只能免费使用3次，欢迎您注册会员后继续使用");
                fw.close();
                fr.close();
                return;
            }

            fw.write(count + "");
        }

        if (fw != null) fw.close();
        fr.close();
        System.out.println("欢迎使用本软件，第"+ count +"次使用免费");
    }
}
