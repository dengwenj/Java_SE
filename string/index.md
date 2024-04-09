## String 概述
* String 是 Java 定义好的一个类，定义在 java.lang 包中，所以使用的时候不需要导包
* java 程序中的所有字符串文字(例如："aabbcc")，都被视为 String 类的对象
* 字符串不可变，它们的值在创建后不能被更改

## String 创建的方式
* 直接赋值 String name = "朴睦"（这种代码简单，节约内存，相同的字符串会复用）
* new 创建出来
* 1、public String() 创建空白字符串，不含任何内容
* 2、public String(String original) 根据传入的字符串，创建字符串对象
* 3、public String(char[] chs) 根据字符数组，创建字符串对象
* 4、public String(byte[] bytes) 根据字节数组，创建字符串对象

## String 的内存分析
* 当使用双引号直接赋值时，系统会检查该字符串在串池中是否存在，会放在串池中（堆里面有个串池），不存在：创建新的，存在：复用
* 当使用 new 关键字创建出来的会在堆内存创建空间，不会复用，创建新的地址

## 字符串比较
* boolean equals(要比较的字符串) 完全一样结果才是 true，否则为 false
* boolean equalslgnoreCase(要比较的字符换) 忽略大小写的比较
* 以后只要想比较字符串的内容，就必须要用 String 里面的方法

## 遍历字符串
* public char charAt(0): 根据索引返回字符，String name = "朴睦"; name.charAt(0) -> '朴'
* public int length(): 返回此字符串的长度，String name = "朴睦"; name.length() -> 2

## 字符串截取 
* String substring(int beginIndex, int endIndex) 截取
* 注意点：包头不包尾，包左不包右，只有返回值才是截取的小串
* String substring(int beginIndex) 截取到末尾

## 字符串替换
* String replace(旧值, 新值) 替换
* 注意点：只有返回值才是替换之后的结果

## StringBuilder 概述
* StringBuilder 可以看成是一个容器，创建之后里面的内容是可变的
* 作用：提高字符串的操作效率(StringBuilder 只是容器，来帮助我们操作字符串的工具，后续转成字符串 toString 方法)
```java
public class Demo01 {
    public static void main(String[] args) {
        // 创建一个空白可变字符串对象，不含有任何内容
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1);

        // 根据字符串的内容，来创建可变字符串对象
        StringBuilder sb2 = new StringBuilder("朴睦");
        System.out.println(sb2);
        // 因为 StringBuilder 是 Java 已经写好的类
        // java 在底层对它做了一些特殊处理
        // 打印对象不是地址值而是属性值

        // 一些方法
        // 添加数据，并返回对象本身，StringBuilder 是可以修改内容的
        sb2.append("24");
        System.out.println(sb2); // 朴睦24

        // 反转容器中的内容
        sb2.reverse();
        System.out.println(sb2); // 42睦朴

        // 返回长度
        int len = sb2.length();
        System.out.println(len); // 4

        // 通过 toString() 就可以实现把 StringBuilder 转换成 String 类型
        String str = sb2.toString();
        System.out.println(str); // 42睦朴
    }
}
```

## 链式编程
* 当我们在调用一个方法的时候，不需要用变量接收它的结果，可以继续调用其他方法

## 使用 StringBuilder 的场景
* 1、字符串的拼接
* 2、字符串的反转
