public class Test {
    public static void main(String[] args) {
        method((String name, int age) -> {
            System.out.println(name + "吃饭了");
            return age;
        });

        method2((name, age) -> age);
    }

    public static void method(Eat eat) {
        int age = eat.eating("朴睦", 24);
        System.out.println(age);
    }

    public static void method2(Eat eat) {
        int age = eat.eating("韩妹妹", 18);
        System.out.println(age);
    }
}

@FunctionalInterface
interface Eat {
    public abstract int eating(String name, int age);
}
