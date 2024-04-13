package pm._abstract;

public class Sheep extends Animal {
    public Sheep() {

    }

    public Sheep(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("我是山羊，我在吃草");
    }
}
