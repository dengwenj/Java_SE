package pm._interface3;

public class LQC extends Coach {
    public LQC() {

    }

    public LQC(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教打篮球");
    }
}
