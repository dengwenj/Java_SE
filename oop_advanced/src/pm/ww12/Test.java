package pm.ww12;

public class Test {
    public static void main(String[] args) {
        SYY s1 = new SYY("小王", 20);
        s1.keepPet(new Dog(5, "黄色"), "骨头");

        SYY s2 = new SYY("小李", 25);
        s2.keepPet(new Cat(2, "白色"), "吃鱼");
    }
}
