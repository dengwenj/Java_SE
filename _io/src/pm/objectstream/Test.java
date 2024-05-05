package pm.objectstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test {
    public static void main(String[] args) throws IOException {
        // 把对象输出到文件中
        Student s = new Student("朴睦", 24, "ww");

        ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream("_io/src/pm/objectstream/test.txt"));

        ois.writeObject(s);

        ois.close();
    }
}
