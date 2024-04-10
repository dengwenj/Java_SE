package pu.ww;

public class Test {
    public static void main(String[] args) {
        Phone p1 = new Phone();

        p1.brand = "小米";
        p1.price = 1999;
        System.out.println(p1.brand);
        System.out.println(p1.price);
        p1.call();

        Phone p2 = new Phone();
        p2.brand = "华为";
        p2.price = 5999;
        System.out.println(p2.brand);
        System.out.println(p2.price);
        p2.call();

        Person person1 = new Person();
//        Person.hg = "1";
        Person.hg = "2";
        person1.name = "朴睦";
        person1.age = 24;
        person1.sex = "男";
        person1.eat();
        person1.sleep();
    }
}
