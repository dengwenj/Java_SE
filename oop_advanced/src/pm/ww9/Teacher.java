package pm.ww9;

public class Teacher extends Person {
    @Override
    public void show() {
        System.out.println("老师：" + this.getName() + this.getAge());
    }
}
