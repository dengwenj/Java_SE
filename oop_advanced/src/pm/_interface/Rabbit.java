package pm._interface;

public class Rabbit extends Animal {
    public Rabbit() {

    }

    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("我是兔兔，我在吃胡萝卜");
    }
}
