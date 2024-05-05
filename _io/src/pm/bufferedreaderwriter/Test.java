package pm.bufferedreaderwriter;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("_io/src/pm/bufferedreaderwriter/test.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("_io/src/pm/bufferedreaderwriter/copy.txt"));

        String str;
        while ((str = br.readLine()) != null) {
           System.out.println(str);
            bw.write(str);
            bw.newLine();
        }

        bw.close();
        br.close();
    }
}
