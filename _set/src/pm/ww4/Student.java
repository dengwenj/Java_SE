package pm.ww4;

public class Student implements Comparable<Student> {
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

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }

    @Override
    // this：表示当前要添加的元素
    // o：表示已经在红黑树存在的元素
    // 返回值：
    // 负数：表示当前要添加的元素是小的，存左边
    // 正数：表示当前要添加的元素是大的，存右边
    // 0：表示当前要添加的元素已经存在，舍弃
    public int compareTo(Student o) {
        // 指定排序规则
        return this.getAge() - o.getAge();
    }
}
