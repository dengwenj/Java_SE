package pm._interface4;

public class InterImpl implements InterA, InterB {
    @Override
    public void show() {
        System.out.println("我重写了接口中定义的默认方法");
    }

    @Override
    public void method(InterA a) {
        System.out.println(a instanceof InterImpl);
        System.out.println("这里");
        a.show();
        a.show2();
    }
}
