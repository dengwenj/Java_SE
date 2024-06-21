package vip.dengwj._innerClass;

import vip.dengwj._interface.Swim;

public class Test {
    public static void main(String[] args) {
        Car car = new Car("小米苏7", 1);
        car.show();

        Outer.Inner inner = new Outer().new Inner();

        // 这是个实现类对象
        new Swim() {
            @Override
            public void swim() {
                System.out.println("重写方法");
            }
        };

        // 这个 Outer 类的子类
        Outer o = new Outer() {

        };
        Outer.Inner inner1 = o.new Inner();
    }
}
