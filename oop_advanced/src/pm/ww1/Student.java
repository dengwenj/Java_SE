package pm.ww1;

public class Student {
    private String name;
    private int age;
    // 静态变量存在于类上，被该类所有对象【共享】
    public static String teacherName;

    public Student() {

    }

    public Student(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println(name + age + teacherName);
    }
}
