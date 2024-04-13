package pm._interface3;

public class LQS extends Sportsman {
    public LQS() {

    }

    public LQS(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("学习打篮球");
    }
}
