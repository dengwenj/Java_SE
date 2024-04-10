package pm.ww1;

public class Test {
    public static void main(String[] args) {
        Student.teacherName = "老师张飒";
        Student s1 = new Student();
        s1.setName("朴睦");
        s1.setAge(24);
        s1.show();

        Student s2 = new Student();
        s2.setName("李雷");
        s2.setAge(20);
        s2.show();
    }

}
