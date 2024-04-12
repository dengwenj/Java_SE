package pm.ww2;

public class Student {
    private String name;
    private int age;
    private char sex;

    public Student() {

    }

    public Student(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public void setSex(char sex) {
        this.sex = sex;
    }

    public char getSex() {
        dd();
        return sex;
    }

    public static void dd() {

    }
}
