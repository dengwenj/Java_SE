package pm.anli;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Demo07 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 用对象流读写多个对象
        // 需求：将对个自定义对象序列化到文件中，但是由于对象的个数不确定，反序列化流该如何读取呢
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("_io/src/pm/anli/object.txt"));

        Student s1 = new Student("朴睦", 24);
        Student s2 = new Student("李雷", 20);
        Student s3 = new Student("韩梅梅", 18);

        // 放到集合里
        ArrayList<Student> list = new ArrayList<>();
        Collections.addAll(list, s1, s2, s3);

        oos.writeObject(list);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("_io/src/pm/anli/object.txt"));

        ArrayList<Student> o = (ArrayList<Student>) ois.readObject();
        System.out.println(o); // [Student{name = 朴睦, age = 24}, Student{name = 李雷, age = 20}, Student{name = 韩梅梅, age = 18}]

        ois.close();
    }
}
