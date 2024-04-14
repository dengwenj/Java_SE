package pm._interface4;

public class InterImpl implements InterA, InterB {
    @Override
    public void method() {
        System.out.println("我是接口中定义的抽象方法");
    }

    @Override
    public void show() {
        System.out.println("我重写了接口中定义的默认方法");
    }
}
