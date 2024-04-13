package pm.ww12;

public class Dog extends Animal {
    public Dog() {

    }

    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public String eat(String something) {
        return something;
    }

    public void lookHome() {
        System.out.println("狗狗在看家");
    }
}
