package pm._innerClass2;

public class Outer {
    int num = 10;

    public void show() {
        int a = 10;
        // 局部内部类
        class Inner3 {
            String hh = "ww";

            public void method3() {
                System.out.println(Outer.this.num);
                System.out.println("method3");
            }

            public static void method4() {
                System.out.println("静态方法4");
            }
        }

        Inner3 i3 = new Inner3();
        System.out.println(i3.hh);
        i3.method3();
        Inner3.method4();
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
