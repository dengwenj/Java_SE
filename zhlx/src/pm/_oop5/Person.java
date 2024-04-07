package pm._oop5;

public class Person {
    // 姓名、年龄、性别、爱好
    private String name;
    private int age;
    private char sex;
    private String[] hobby;

    public Person() {

    }

    public Person(String name, int age, char sex, String[] hobby) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.hobby = hobby;
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
        return sex;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public String[] getHobby() {
        return hobby;
    }
}
