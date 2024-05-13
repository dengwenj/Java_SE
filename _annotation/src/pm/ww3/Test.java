package pm.ww3;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws NoSuchMethodException {
        // 解析Demo 中的注解
        // 首先获取到 Demo 的 class 对象
        Class<Demo> demoClass = Demo.class;

        // 判断当前对象上是否存在某个注解
        boolean isAnnotation = demoClass.isAnnotationPresent(MyTest4.class);
        if (isAnnotation) {
            // 获取到该注解
            MyTest4 declaredAnnotation = demoClass.getDeclaredAnnotation(MyTest4.class);
            System.out.println("declaredAnnotation.aaa() = " + declaredAnnotation.value());
            System.out.println("declaredAnnotation.aaa() = " + declaredAnnotation.aaa());
            System.out.println("declaredAnnotation.bbb() = " + Arrays.toString(declaredAnnotation.bbb()));
        }
        System.out.println("------------------");

        // 获取到方法上的注解
        // 先获取到这个方法
        Method declaredMethod = demoClass.getDeclaredMethod("test1");
        MyTest4 methodAnnotation = declaredMethod.getDeclaredAnnotation(MyTest4.class);
        System.out.println("methodAnnotation.value() = " + methodAnnotation.value());
        System.out.println("methodAnnotation.bbb() = " + Arrays.toString(methodAnnotation.bbb()));
        System.out.println("methodAnnotation.aaa() = " + methodAnnotation.aaa());
    }
}
