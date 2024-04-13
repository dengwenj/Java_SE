package pm.ww12;

public class Cat extends Animal {
    public Cat() {

    }

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public String eat(String something) {
        return something;
    }

    // 子类特有的方法
    public void catchMouse() {
        System.out.println("猫在逮老鼠");
    }
}
