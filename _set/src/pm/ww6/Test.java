package pm.ww6;

import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("朴睦", 24, 98, 91, 99);
        Student s2 = new Student("李雷", 21, 90, 96, 88);
        Student s3 = new Student("韩梅梅", 18, 78, 51, 79);
        Student s4 = new Student("王阳明", 26, 88, 84, 77);
        Student s5 = new Student("王小波", 20, 74, 83, 90);

        TreeSet<Student> ts = new TreeSet<>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        for (Student t : ts) {
            System.out.println(t);
            System.out.println(t.getSxScore() + t.getYyScore() + t.getYwScore());
        }
    }
}
