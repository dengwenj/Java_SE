package pm.ww2;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();

        Student s2 = new Student("朴睦", 24);
        System.out.println(s2.getName());
        System.out.println(s2.getAge());
    }
}
