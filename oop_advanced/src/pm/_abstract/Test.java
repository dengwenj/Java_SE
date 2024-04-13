package pm._abstract;

public class Test {
    public static void main(String[] args) {
        Student s = new Student("朴睦", 24);
        System.out.println(s.getName() + s.getAge());
        s.work();

        Teacher t = new Teacher("韩梅梅", 28);
        t.work();
    }
}
