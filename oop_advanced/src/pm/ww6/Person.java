package pm.ww6;

public class Person {
    String name;
    int age;

    public Person() {
        System.out.println("我是父类无参构造");
    }

    public Person(String name, int age) {
        System.out.println("我是父类有参构造");
        this.age = age;
        this.name = name;
    }
}
