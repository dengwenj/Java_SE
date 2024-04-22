package pm.ww;

public class Person {
    private String name;
    private int age;
    private int height;

    public Person() {
    }

    public Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
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

    /**
     * 获取
     * @return height
     */
    public int getHeight() {
        return height;
    }

    /**
     * 设置
     * @param height
     */
    public void setHeight(int height) {
        this.height = height;
    }

    public String toString() {
        return "Person{name = " + name + ", age = " + age + ", height = " + height + "}";
    }
}
