package vip.dengwj._duotai;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Student("朴睦", 24);
        p1.show();
        System.out.println(p1);

        Person p2 = new Teacher("老师", 28);
        p2.show();
        System.out.println(p2);
    }
}
