package pm.ww11;

public class Test {
    public static void main(String[] args) {
        // 多态
        Animal a = new Dog();
        a.eat();
        // 这个是不行的，因为父类没有这个方法，在编译的时候会报错，这个方法是子类特有的
        // a.show();
        // 强转，把 a Animal类型转成 Dog类型，这样就可以用子类的特有方法
        Dog d = (Dog) a;
        d.show();
    }
}

class Animal {
    public void eat() {
        System.out.println("吃饭");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗狗在吃骨头");
    }

    public void show() {
        System.out.println("狗狗在嘻嘻");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫猫在吃小鱼干");
    }

    public void show() {
        System.out.println("猫猫在抓老鼠");
    }
}
