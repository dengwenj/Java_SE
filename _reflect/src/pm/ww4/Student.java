package pm.ww4;

import java.io.IOException;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    public void sleep(String name) {
        System.out.println(name + "在睡觉");
    }

    private String eat(String e) throws IOException, NullPointerException {
        System.out.println("在吃" + e);
        return "哈哈哈哈";
    }

    public void eat(String e, int c) {
        System.out.println("在吃" + e);
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
