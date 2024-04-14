package pm._innerClass3;

public class Test {
    public static void main(String[] args) {
        // 多态
        Inter i = new Inter() {
            @Override
            public void show() {
                System.out.println("我是匿名内部类，是实现类");
            }
        };
        i.show();

        new Animal() {
            @Override
            public void show() {
                System.out.println("我是匿名内部类，是继承类");
            }
        }.show();

        // 多态
        method(new Animal() {
            @Override
            public void show() {
                System.out.println("被下面的 method 方法调用了");
            }
        });
    }

    public static void method(Animal a) {
        a.show();
    }
}
