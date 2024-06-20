package vip.dengwj._interface;

public interface Inter {
    public abstract void method();

    public default void show() {
        System.out.println("展示展示");
    }

    public static void Ww() {
        System.out.println("你好啊");
    }
}
