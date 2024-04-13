package pm.ww10;

public class Student extends Person {
    String name = "学生";

    @Override
    public void show() {
        System.out.println("子类的show");
    }
}
