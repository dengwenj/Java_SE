package pm.ww9;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("朴睦");
        s.setAge(24);

        Teacher teacher = new Teacher();
        teacher.setName("李雷");
        teacher.setAge(30);

        Admin admin = new Admin();
        admin.setName("管理员");
        admin.setAge(40);

        re(s);
        re(teacher);
        re(admin);
    }

    public static void re(Person p) {
        p.show();
    }
}
