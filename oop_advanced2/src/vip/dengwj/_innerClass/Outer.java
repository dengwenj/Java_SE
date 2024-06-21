package vip.dengwj._innerClass;

public class Outer {
    private final int a = 1;

    public class Inner {
        private final int a = 2;

        public void show() {
            System.out.println(a);
            System.out.println("Outer.this.a = " + Outer.this.a);
        }
    }
}
