package pm.ww12;

public class SYY extends Person {
    public SYY() {

    }

    public SYY(String name, int age) {
        super(name, age);
    }

    @Override
    public void keepPet(Animal a, String something) {
        // JDK 14 以后 a instanceof Dog dog
        if (a instanceof Dog dog) {
            System.out.println(
                "年龄为" + this.getAge() + "岁的" + this.getName() + "养了一只" + a.getColor() + "的" + a.getAge() + "岁的狗"
                    + a.getAge() + "岁的" + a.getColor() + "的狗两只前腿死死的抱住" + a.eat(something) + "猛吃"
            );
            dog.lookHome();
        } else if (a instanceof Cat cat) {
            System.out.println(
                "年龄为" + this.getAge() + "岁的" + this.getName() + "养了一只" + a.getColor() + "的" + a.getAge() + "岁的猫"
                    + a.getAge() + "岁的" + a.getColor() + "的猫咪着眼睛侧着头" + a.eat(something)
            );
            cat.catchMouse();
        } else {
            System.out.println("没有这种动物");
        }
    }
}
