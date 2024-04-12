package pm.ww6;

public class Student extends Person {
    public Student() {

    }

    public Student(String name, int age) {
        super(name, age);
        System.out.println(this.name + this.age);
    }
}
