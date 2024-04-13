package pm._abstract;

public class Teacher extends Person {
    public Teacher() {}

    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("我是老师，讲课是我的工作");
    }
}
