package pm._interface3;

public class PPC extends Coach implements English {
    public PPC() {

    }

    public PPC(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教打乒乓球");
    }

    @Override
    public void say() {
        System.out.println("说英语");
    }
}
