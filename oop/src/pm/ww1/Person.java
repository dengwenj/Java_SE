package pm.ww1;

public class Person {
    // 成员变量
    private String name;
    private int age;
    private String sex;

    // private 私有的，针对于每个私有化的成员变量，都要提供 get 和 set 方法，更加的安全
    // set 方法：给成员变量赋值
    // get 方法：对外提供成员变量的值

    public void setName(String name) { // name 是局部变量
        // this.name 是成员变量
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age >= 18 && age < 50) {
            this.age = age;
        } else {
            System.out.println("年龄不符合");
        }
    }

    public int getAge() {
        return age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void eat() {
        System.out.println("吃饭");
    }
}
