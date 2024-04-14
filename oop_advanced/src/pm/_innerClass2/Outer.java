package pm._innerClass2;

public class Outer {
    int num = 10;

    public void show() {
        System.out.println("外部内 show 方法");
    }

    // 成员内部类
    class Inner {
        int num = 20;

        public void show() {
            System.out.println("内部内 show 方法");
            System.out.println(this.num); // 20
            System.out.println(Outer.this.num); // 10
            Outer.this.show();
        }
    }

    public Inner getInnerI() {
        return new Inner();
    }

    public void method2() {
        System.out.println("method2");
    }

    // 静态内部类
    public static class Inner2 {
        String name = "朴睦";
        public static void method1() {
            System.out.println("method1");
            new Outer().method2();
        }
    }
}
