package vip.dengwj._static;

public class Test {
    public static void main(String[] args) {
        Student.t = "历史老师";
        Student s1 = new Student("朴睦", 24);
        Student s2 = new Student("李雷", 20);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(Student.t);
    }
}
