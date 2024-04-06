package pm.ww2;

public class Student {
    private String name;
    private int age;

    // 无参构造方法
    public Student() {
        System.out.println("我是无参构造函数");
    }

    // 如果定义了构造方法，系统将不再提供默认的构造方法
    // 有参构造方法
    public Student(String name, int age) {
        setName(name);
        setAge(age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }
}
