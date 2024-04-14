package pm._interface4;

public class Test {
    public static void main(String[] args) {
        InterA ii = new InterImpl();
        ii.method(ii);
//        ii.show();

        // 子类把从父类继承下来的虚方法表里面的方法进行覆盖了，这才叫重写
        // 接口中的静态方法不能被重写
//        InterA.st();
    }
}
