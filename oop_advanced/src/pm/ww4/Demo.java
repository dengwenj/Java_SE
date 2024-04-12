package pm.ww4;

public class Demo {
    public static void main(String[] args) {
        S s1 = new S();
    }
}

class F {
    private String name;
    int age;

    public F() {

    }

    public F(String name, int age) {

    }

    // 能被子类继承
    public void method1() {

    }
    // 不能被子类继承
    private void  method2() {}
}

class S extends F {
    private String game;

    public void me() {

    }
}
