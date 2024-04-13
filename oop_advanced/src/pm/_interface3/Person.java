package pm._interface3;

// 不让外界去创建 person 对象
public abstract class Person {
    private String name;
    private int age;

    public Person() {

    }

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
