package pm.ww9;

public class Student extends Person {
    @Override
    public void show() {
        System.out.println("学生：" + this.getName() + this.getAge());
    }
}
