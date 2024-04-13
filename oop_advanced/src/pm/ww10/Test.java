package pm.ww10;

public class Test {
    public static void main(String[] args) {
        // 多态的形式创建学生
        Person p = new Student();
        System.out.println(p.name); // 朴睦
        p.show(); // 子类show

        // Person p = new Student();
        // 现在用 p 去调用变量和方法而 p 是 Person 类型的，所以默认都会从 Person 这个类中去找
        // 成员变量：在子类的对象中，会把父类的成员变量也继承下来
        // 成员方法：如果子类对方法进行了重写，那么在虚方法表中是会把父类的方法进行覆盖的
    }
}
