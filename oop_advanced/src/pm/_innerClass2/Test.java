package pm._innerClass2;

public class Test {
    public static void main(String[] args) {
        // 成员内部类
        Outer.Inner oi = new Outer().new Inner();
        oi.show();

        //System.out.println(new Outer().getInnerI());
        System.out.println("------------");
        // 静态内部类
        Outer.Inner2 oi2 = new Outer.Inner2();
        System.out.println(oi2.name);
        Outer.Inner2.method1();

        System.out.println("-----------");

        Outer o = new Outer();
        o.show();
    }
}
