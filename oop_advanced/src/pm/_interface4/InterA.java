package pm._interface4;

public interface InterA {
    public abstract void method();

    public default void show() {
        System.out.println("我是接口中定义的默认方法");
        show3();
    }

    public default void show2() {
        System.out.println("show");
        show3();
    }

    public static void st() {
        System.out.println("我是借口中的静态方法");
        show4();
    }

    // 接口私有方法
    private void show3() {
        System.out.println("分别在 show、show2 中调用");
    }

    // 静态私有方法
    private static void show4() {
        System.out.println("在静态中调用");
    }
}
