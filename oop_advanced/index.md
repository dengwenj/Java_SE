## 面向对象进阶

## static 静态变量
* static 表示静态，是 java 中的一个修饰符，可以修饰成员方法，成员变量
* 被 static 修饰的成员变量，叫做静态变量
* 特点：
* 共享的东西可以用静态变量
* 1、被该类所有对象【共享】
* 2、不属于对象，属于类
* 3、随着类的加载而加载，优先于对象存在
* 调用方式：
* 类名调用 Person.ss

## static 静态方法
* 被 static 修饰的成员方法，叫做静态方法
* 特点：
* 1、多用在测试类和工具类中
* 2、javabean 类中很少会用
* 调用方式：
* 类名调用

## 三种类
* javabean 类：用来描述一类事物的类，比如：Student、Dog
* 测试类：用来检查其他类是否书写正确，带有 main 方法的类，是程序的入口
* 工具类：不是用来描述一类事物的，而是帮我们做一些事情的类，Math...

## 工具类
* 类名见名知意
* 私有化构造方法
* 方法定义为静态
* 工具类帮助我解决各种各样事情的，只是一个工具，不需要创建它的对象。工具类是静态方法的一个使用场景
```java
public class ArrUtil {
    private ArrUtil() {}
    
    public static int getMax() {}
    public static int getMin() {}
    public static int getSum() {}
}
```