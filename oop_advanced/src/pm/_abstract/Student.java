package pm._abstract;

public class Student extends Person {
    public Student() {

    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("我是学生，学习是我的工作");
    }
}
