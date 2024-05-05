package pm.objectstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("_io/src/pm/objectstream/test.txt"));

        Student o = (Student) ois.readObject();
        System.out.println(o); // Student{name='朴睦', age=24, ww='null'}

        ois.close();
    }
}
