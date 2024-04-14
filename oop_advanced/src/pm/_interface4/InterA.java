package pm._interface4;

public interface InterA {
    public abstract void method();

    public default void show() {
        System.out.println("我是接口中定义的默认方法");
    }
}
