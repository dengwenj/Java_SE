package vip.dengwj.object;

import java.util.Arrays;

// Cloneable
// 如果一个接口里面没有抽象方法，表示当前的接口是一个标记性接口
// 现在 Cloneable 表示一旦实现，那么当前类的对象就可以被克隆
// 如果没有实现，当前类的对象就不能克隆
public class User implements Cloneable {
    private String name;
    private int age;
    private int[] data;

    public User() {

    }

    public User(String name, int age, int[] data) {
        this.name = name;
        this.age = age;
        this.data = data;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int[] getData() {
        return data;
    }

    @Override
    public String toString() {
        return "User{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", data=" + Arrays.toString(data) +
            '}';
    }

    // 重写父类的 clone
    @Override
    protected Object clone() throws CloneNotSupportedException {
        int[] newData = new int[data.length];

        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }

        User u = (User) super.clone();
        u.data = newData;

        return u;
    }
}
