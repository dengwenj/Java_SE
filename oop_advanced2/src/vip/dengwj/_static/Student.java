package vip.dengwj._static;

public class Student {
    private String name;
    private int age;

    public static String t;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        method();
    }

    public static void method() {

    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
