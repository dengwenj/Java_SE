package pm._interClass;

public class Car {
    String name;

    public void show() {
        System.out.println(name);

        En e = new Car.En();
        e.name = "发送机名字";
        System.out.println(e.name);
        e.show();
    }

    public static class En {
        String name;

        public void show() {
            System.out.println("En 的 show");
        }
    }
}
