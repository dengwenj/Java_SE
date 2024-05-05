package pm.objectstream;

import java.io.Serial;
import java.io.Serializable;

public class Student implements Serializable {
    @Serial
    private static final long serialVersionUID = 11L;

    private String name;
    private int age;
    // 该变量不参与序列化过程
    private transient String ww;

    public Student() {
    }

    public Student(String name, int age, String ww) {
        this.name = name;
        this.age = age;
        this.ww = ww;
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

    @Override
    public String toString() {
        return "Student{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", ww='" + ww + '\'' +
            '}';
    }
}
