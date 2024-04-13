package pm._abstract;

public class Test {
    public static void main(String[] args) {
//        Student s = new Student("朴睦", 24);
//        System.out.println(s.getName() + s.getAge());
//        s.work();
//
//        Teacher t = new Teacher("韩梅梅", 28);
//        t.work();

        Frog f = new Frog("青蛙", 3);
        System.out.println(f.getName() + f.getAge());
        f.eat();
        f.dunk();

        Dog dog = new Dog("狗狗 ", 5);
        System.out.println(dog.getName() + dog.getAge());
        dog.eat();
        dog.dunk();

        Sheep sheep = new Sheep("山羊", 7);
        System.out.println(sheep.getName() + sheep.getAge());
        sheep.eat();
        sheep.dunk();
    }
}
