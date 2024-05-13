## 注解
* 就是 java 代码里的特殊标记，比如：@Override、@Test 等，作用是：让其他程序根据注解信息来决定怎么执行该程序
* 注解可以用在类上、构造器上、方法上、成员变量上、参数上等位置处

## 自定义注解
* public @interface 注解名称 { public 属性类型 属性名() default 默认值; }

## 特殊属性名：value
* 如果注解中只有一个 value 属性，使用注解时，value 名称可以不写

## 注解的原理
* 注解本质是一个接口，java 中所有注解都是继承了 Annotation 接口的
* @注解(...)：其实就是一个实现类对象，实现了该注解以及 Annotation 接口

## 元注解
* 指的是：修饰注解的注解

## @Target(ElementType.Type)
* 作用：声明被修饰的注解只能在哪些位置使用
* 1、TYPE：类，接口
* 2、FIELD：成员变量
* 3、METHOD：成员方法
* 4、PARAMETER：方法参数
* 5、CONSTRUCTOR：构造器
* 6、LOCAL_VARIABLE：局部变量

## @Retention(RetentionPolicy.RUNTIME)
* 作用：声明注解的保留周期
* 1、SOURCE：只作用在源码阶段，字节码文件中不存在
* 2、CLASS（默认值）：保留到字节码文件阶段，运行阶段不存在
* 3、RUNTIME（开发常用）：一直保留到运行阶段

## 什么是注解的解析？
* 就是判断类上、方法上、成员变量上是否存在注解，并把注解里的内容给解析出来

## 如何解析注解？
* 要解析谁上面的注解，就应该先拿到谁
* 比如要解析类上面的注解，则应该先获取该类的 Class 对象，再通过 Class 对象解析其上面的注解
* 比如要解析成员方法上的注解，则应该获取到该成员方法的 Method 对象，再通过 Method 对象解析其上面的注解
* Class、Method、Field、Constructor、都实现了 AnnotatedElement 接口，它们都拥有解析注解的能力

## AnnotatedElement 接口提供了解析注解方法
* public Annotation[] getDeclaredAnnotations(); 获取当前对象上面的注解
* public T getDeclaredAnnotation(Class<T> annotationClass); 获取指定的注解对象
* public boolean isAnnotationPresent(Class<Annotation> annotationClass); 判断当前对象上是否存在某个注解
```java
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
```