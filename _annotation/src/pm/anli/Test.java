package pm.anli;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
    private static final String pm = "朴睦";

    @MyTest
    public static void test1() {
        System.out.println("test1");
    }

    @MyWw(pm)
    public static void test2(String name) {
        System.out.println("test2 -> " + name);
    }

    @MethodParams({
        @Param(name = "param1", type = int.class, acceptedValues = {"测试"}),
        @Param(name = "param2", type = String.class, acceptedValues = {"p2"})
    })
    public static void test3(String p) {
        System.out.println(p);
    }

    @MyTest
    public static void test4() {
        System.out.println("test4");
    }

    @MyTest
    public static void test5() {
        System.out.println("test5");
    }

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        // 定义若干个方法，只要加了 MyTest 注解，就会触发该方法执行

        // 先获取到这个类
        Class<Test> testClass = Test.class;

        Test t = new Test();
        // 获取这个类里面的所有方法
        Method[] methods = testClass.getDeclaredMethods();
        for (Method method : methods) {
            // 只要加了 MyTest 注解就调用
            if (method.isAnnotationPresent(MyTest.class)) {
                method.invoke(t);
            } else if (method.isAnnotationPresent(MyWw.class)) {
                method.invoke(t, method.getDeclaredAnnotation(MyWw.class).value());
            }
        }
    }
}
