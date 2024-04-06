package pm.ww1;

public class Person {
    private String name;
    private int age;
    private String sex;

    // private 私有的，针对于每个私有化的成员变量，都要提供 get 和 set 方法，更加的安全
    // set 方法：给成员变量赋值
    // get 方法：对外提供成员变量的值

    public void setName(String n1) {
        name = n1;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        if (a >= 18 && a < 50) {
            age = a;
        } else {
            System.out.println("年龄不符合");
        }
    }

    public int getAge() {
        return age;
    }

    public void setSex(String s) {
        sex = s;
    }

    public String getSex() {
        return sex;
    }

    public void eat() {
        System.out.println("吃饭");
    }
}
