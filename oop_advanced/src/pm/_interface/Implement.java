package pm._interface;

public class Implement implements Inter {
    @Override
    public void method() {
        System.out.println(Inter.num);
        System.out.println("方法");
    }
}
