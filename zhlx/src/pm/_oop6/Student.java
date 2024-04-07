package pm._oop6;

public class Student {
    // 学号，姓名，年龄
    private int id;
    private String name;
    private int age;

    public Student() {

    }

    public Student(int id, String name, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
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
}
