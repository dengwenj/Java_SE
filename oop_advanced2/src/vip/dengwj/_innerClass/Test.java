package vip.dengwj._innerClass;

public class Test {
    public static void main(String[] args) {
        Car car = new Car("小米苏7", 1);
        car.show();

        Outer.Inner inner = new Outer().new Inner();
    }
}
