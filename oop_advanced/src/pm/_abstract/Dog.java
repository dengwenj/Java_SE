package pm._abstract;

public class Dog extends Animal {
    public Dog() {

    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("我是狗狗，我在吃骨头");
    }
}
