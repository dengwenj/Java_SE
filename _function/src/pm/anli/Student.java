package pm.anli;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String s) {
        String[] split = s.split(",");
        this.name = split[0];
        this.age = Integer.parseInt(split[1]);
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

    public String pj() {
        return name + "-" + age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
