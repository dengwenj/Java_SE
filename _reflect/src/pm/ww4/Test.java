package pm.ww4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.lang.reflect.Type;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        // 获取 class 字节码对象
        Class clazz = Class.forName("pm.ww4.Student");

        // 获取公共所有方法,包括父类
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("------------------------------");

        // 获取所有方法，不包括父类
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
        System.out.println("------------------------------");

        // 获取公共单个方法
        Method method = clazz.getMethod("eat", String.class, int.class);
        System.out.println(method);
        System.out.println("------------------------------");

        // 获取单个方法
        Method declaredMethod = clazz.getDeclaredMethod("eat", String.class);
        System.out.println(declaredMethod);

        // 获取方法的名字
        String name = declaredMethod.getName();
        System.out.println(name); // eat
        System.out.println("------------------------------");

        // 获取方法的修饰符
        int modifiers = declaredMethod.getModifiers();
        System.out.println(modifiers); // 2
        System.out.println("------------------------------");

        // 获取方法的参数
        Parameter[] parameters = declaredMethod.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter);
            String name1 = parameter.getName();
            System.out.println(name1);
            Class<?> type = parameter.getType();
            System.out.println(type.getName().equals("java.lang.String"));
        }
        System.out.println("------------------------------");

        // 获取方法抛出的异常
        Class<?>[] exceptionTypes = declaredMethod.getExceptionTypes();
        for (Class<?> exceptionType : exceptionTypes) {
            System.out.println(exceptionType);
        }
        System.out.println("------------------------------");

        // 方法运行
        Student s = new Student();
        declaredMethod.setAccessible(true);
        String res = (String) declaredMethod.invoke(s, "鲜花饼");
        System.out.println(res);
    }
}
