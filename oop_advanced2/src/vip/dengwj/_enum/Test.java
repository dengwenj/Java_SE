package vip.dengwj._enum;

public class Test {
    public static void main(String[] args) {
        AWW z = AWW.Z;
        z.method();

        method(z);
    }

    public static void method(AWW aww) {
        if (aww == AWW.Z) {
            System.out.println("zzzzz");
        } else if (aww == AWW.Y) {
            System.out.println("yyyy");
        }
    }
}
