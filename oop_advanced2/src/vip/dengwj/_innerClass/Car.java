package vip.dengwj._innerClass;

public class Car {
    private final String name;
    private final int age;

    public Car(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println(this.name);
        E e = new E();
        System.out.println(e.eName);
        e.show();
    }

    class E {
        private String eName;
        private int eAge;

        public void show() {
            System.out.println(name);
            System.out.println(age);
        }
    }
}
