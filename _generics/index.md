## 泛型
* 是 JDK5 中引入的特性，可以在编译阶段约束操作的数据类型，并进行检查
* 泛型的格式：<数据类型>
* 泛型只支持引用数据类型


## 泛型的好处
* 统一数据类型
* 把运行时期的问题提前到了编译期间，避免了强制类型转换可能出现的异常，因为在编译阶段类型就能确定了
* java 中的泛型是伪泛型

## 泛型的细节
* 泛型中不能写基本数据类型，因为最终集合当中的类型都要转成 Object 类型
* 指定泛型的具体类型后，传递数据时，可以传入该类类型或者子类类型
* 如果不写泛型，类型默认是 Object

## 泛型类
* 当一个类中，某个变量的数据类型不确定时，就可以定义带有泛型的类
* 修饰符 class 类名<类型> {}; public class ArrayList<E> {}
* 此处 E 可以理解为变量，但是不是用来记录数据的，而是记录数据的类型，可以协程：T、E、K、V 等

## 泛型方法
* 方法中形参类型不确定时
* 方案1：使用类名后面定义的泛型（所有方法都能用）
* 方案2：在方法申明上定义自己的泛型（只有本方法能用）
* 修饰符 <类型> 返回值类型 方法名(类型 变量名) {}; public <T> void show(T t) {}
* 在调用的时候确定的类型
```java
import java.util.ArrayList;

public class ListUtil {
    private ListUtil() {}

    // 用来添加多个集合的元素
    // 泛型方法定义写在修饰符的后面
    public static<E> void addAll(ArrayList<E> list, E e1, E e2, E e3) {
        list.add(e1);
        list.add(e2);
        list.add(e3);
    }

    public static<E> void addAll2(ArrayList<E> list, E ...es) {
        for (E e : es) {
            list.add(e);
        }
    }
}
```

## 泛型接口
* 修饰符 interface 接口名<类型> {}; public interface List<E> {}
* 如何使用一个泛型的接口：
* 1、实现类给出具体类型
* 2、实现类延续泛型，创建对象时再确定
