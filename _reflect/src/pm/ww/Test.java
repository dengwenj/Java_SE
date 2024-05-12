package pm.ww;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        // 获取 class 对象的三种方式

        // 1、全类名：包名 + 类名
        // 最为常用
        Class clazz1 = Class.forName("pm.ww.Student");

        // 2、一般更多的事当做参数进行传递
        Class clazz2 = Student.class;

        System.out.println(clazz1 == clazz2); // true

        // 3、当我们已经有了这个类的对象时，才可以使用
        Student s = new Student();
        Class<? extends Student> clazz3 = s.getClass();

        System.out.println(clazz1 == clazz3); // true
    }
}
