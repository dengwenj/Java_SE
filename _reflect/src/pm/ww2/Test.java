package pm.ww2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;

public class Test {
    public static void main(String[] args) throws
        ClassNotFoundException,
        NoSuchMethodException,
        InvocationTargetException,
        InstantiationException,
        IllegalAccessException
    {
        // 获取 class 字节码对象
        Class clazz = Class.forName("pm.ww2.Student");

        // 获取构造方法一系列
        Constructor[] con1 = clazz.getConstructors(); // 获取所有公共的
        for (Constructor constructor : con1) {
            System.out.println(constructor);
        }
        System.out.println("------------------------");

        Constructor[] con2 = clazz.getDeclaredConstructors(); // 获取所有的
        for (Constructor constructor : con2) {
            System.out.println(constructor);
        }
        System.out.println("------------------------");

        Constructor con3 = clazz.getConstructor(); // 获取单个公共的构造方法，无参的
        System.out.println(con3);
        System.out.println("------------------------");

        Constructor con4 = clazz.getConstructor(String.class); // 获取单个公共的构造方法，有参的
        System.out.println(con4);
        System.out.println("------------------------");

        Constructor con5 = clazz.getDeclaredConstructor(String.class, int.class); // 获取单个所有的构造方法
        System.out.println(con5);
        System.out.println("------------------------");

        // 获取名字
        String name = con5.getName();
        System.out.println(name); // pm.ww2.Student
        System.out.println("------------------------");

        int modifiers = con5.getModifiers();
        System.out.println(modifiers); // 获取修饰符
        System.out.println("------------------------");

        Parameter[] params = con5.getParameters(); // 获取参数
        for (Parameter param : params) {
            System.out.println(param);
        }
        System.out.println("------------------------");

        // 暴力反射：表示临时取消权限校验
        con5.setAccessible(true);
        Student s = (Student) con5.newInstance("朴睦", 24);
        System.out.println(s); // Student{name = 朴睦, age = 24}
    }
}
