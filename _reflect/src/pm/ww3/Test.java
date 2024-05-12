package pm.ww3;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        // 获取 class 字节码对象
        Class clazz = Class.forName("pm.ww3.Student");

        Field[] fields = clazz.getFields(); // 获取所有公共的成员变量
        System.out.println(Arrays.toString(fields));
        System.out.println("----------------------");

        Field[] declaredFields = clazz.getDeclaredFields(); // 获取所有的成员变量
        System.out.println(Arrays.toString(declaredFields));
        System.out.println("----------------------");

        Field field = clazz.getField("sex"); // 获取单个公共的成员变量
        System.out.println(field);
        System.out.println("----------------------");

        Field declaredField = clazz.getDeclaredField("name"); // 获取单个所有的成员变量
        System.out.println(declaredField);
        System.out.println("----------------------");

        String name = declaredField.getName(); // 获取成员变量的名字
        System.out.println(name); // name
        System.out.println("----------------------");

        int modifiers = declaredField.getModifiers(); // 获取成员变量的修饰符
        System.out.println(modifiers); // 2
        System.out.println("----------------------");

        declaredField.setAccessible(true);
        Student s = new Student("朴睦", 24, "男");
        String str = (String) declaredField.get(s); // 获取 name 成员变量的值
        System.out.println(str); // 朴睦
        System.out.println("----------------------");

        // 修改值 name 成员变量的值
        declaredField.set(s, "李雷");
        System.out.println(s); // Student{name = 李雷, age = 24, sex = 男}
    }
}
