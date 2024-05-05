package pm.anli;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo03 {
    public static void main(String[] args) throws IOException {
        // 修改文件中的数据
        // 文本文件中有以下的数据：2-1-9-4-7-8
        // 将文件中的数据进行排序，变成以下的数据：1-2-4-7-8-9
        FileReader fr = new FileReader("_io/sort.txt");

        ArrayList<String> list = new ArrayList<>();
        char[] chars = new char[1024];
        int len;
        while ((len = fr.read(chars)) != -1) {
            String str = new String(chars, 0, len);
            String[] split = str.split("-");
            Collections.addAll(list, split);
        }

        Integer[] integers = list.stream()
            .map(Integer::parseInt)
            .sorted()
            .toArray(Integer[]::new);

        String string = Arrays.toString(integers);
        String replace = string.replace(", ", "-");
        String substring = replace.substring(1, replace.length() - 1);

        FileWriter fw = new FileWriter("_io/sort.txt");
        fw.write(substring);

        fw.close();
        fr.close();
    }
}
