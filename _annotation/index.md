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