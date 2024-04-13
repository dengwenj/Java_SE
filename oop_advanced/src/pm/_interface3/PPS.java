package pm._interface3;

public class PPS extends Sportsman implements English {
    public PPS() {

    }

    public PPS(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("学习打乒乓球");
    }

    @Override
    public void say() {
        System.out.println("说英语");
    }
}
