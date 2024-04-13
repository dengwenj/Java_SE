package pm.ww12;

public class Animal {
    private int age;
    private String color;

    public Animal() {

    }

    public Animal(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String eat(String something) {
        return something;
    }
}
