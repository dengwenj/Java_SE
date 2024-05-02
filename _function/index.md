## 方法引用
* 把已经有的方法拿过来用，当做函数式接口中抽象方法的方法体

## :: 是什么符号？
* 方法引用符

## 方法引用时要注意什么？
* 需要有函数式接口
* 被引用方法必须已经存在
* 被引用方法的形参和返回值需要跟抽象方法保持一致
* 被引用方法的功能要满足当前的需求

## 方法引用的分类
* 1、引用静态方法
* 2、引用成员方法
* 3、引用构造方法

## 引用静态方法
* 格式：类名::静态方法
* 例：Integer::parseInt

## 引用成员方法
* 格式：对象::成员方法
* 其他类：其他类对象::方法名
* 本类：this::方法名， 引用处不能是静态方法
* 父类：super::方法名 ，引用处不能是静态方法

## 引用构造方法
* 格式：类名::new
* 例：Student::new
* 作用是创建这个类的对象
```java
package pm.ww3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // 集合里面存储姓名和年龄，比如：张无忌,15
        // 将数据封装成 Student 对象并收集到 List 集合中
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌,15", "朴睦,24");

        List<Student> students = list.stream()
            .map(Student::new)
            .toList();
        System.out.println(students); // [Student{name = 张无忌, age = 15}, Student{name = 朴睦, age = 24}]
    }
}
```

## 使用类名引用成员方法
* 格式：类名::成员方法
* 例：String::substring
* 规则：
* 1、需要有函数式接口
* 2、被引用的方法必须已经存在
* 3、被引用方法的形参，需要跟抽象方法的第二个形参到最后一个形参保持一致，返回值需要保持一致！！！！！
* 4、被引用方法的功能需要满足当前的需求
* 抽象方法形参的详解：
* 第一个参数：表示被引用方法的调用者，决定了可以引用哪些类中的方法，在 Stream 流当中，第一个参数一般都表示流里面的每一个数据，
* 假设流里面的数据是字符串，那么使用这种方式进行方法引用，只能引用String这个类中的方法
* 第二个参数到最后一个参数：跟被引用方法的形参保持一致，如果没有第二个参数，说明被引用的方法需要是无参的成员方法
* 局限性：
* 1、不能引用所有类中的成员方法
* 2、是跟抽象方法的第一个参数有关，这个参数是什么类型的，那么就只能引用这个类中的方法
* 例：map(String::toUpperCase)，就是拿着流里面的每一个数据，去调用 String 类中的 toUpperCase 方法，方法的返回值就是转换之后的结果
```java
package pm.ww4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // 使用类名引用成员方法
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "abc", "cba", "bcd");

        List<String> list1 = list.stream()
            .map(String::toUpperCase)
            .toList();
        System.out.println(list1); // [ABC, CBA, BCD]
    }
}
```

## 引用数组的构造方法
* 格式：数据类型[]::new
* 例：int[]::new
* 细节：数组的类型，需要跟流中数据的类型保持一致