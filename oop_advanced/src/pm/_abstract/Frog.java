package pm._abstract;

public class Frog extends Animal {
    public Frog() {

    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("我是青蛙，我在吃虫子");
    }
}
