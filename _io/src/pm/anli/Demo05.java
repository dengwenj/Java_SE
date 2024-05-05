package pm.anli;

import java.io.*;
import java.util.Comparator;
import java.util.TreeSet;

public class Demo05 {
    public static void main(String[] args) throws IOException {
        // 修改文本顺序
        // 需求：把《出师表》的文章顺序进行恢复到一个新文件中
        BufferedReader br = new BufferedReader(new FileReader("_io/src/pm/anli/csb.txt"));

        TreeSet<String> list = new TreeSet<>(Comparator.comparingInt(o -> Integer.parseInt(o.substring(0, 1))));
        String str;
        while ((str = br.readLine()) != null) {
            list.add(str);
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter("_io/src/pm/anli/csb1.txt"));
        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }

        bw.close();
        br.close();
    }
}
