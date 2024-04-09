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

## StringJoiner 
* StringJoiner 和 StringBuilder 一样，也可以看成是一个容器，创建之后里面的内容是可变的
* 作用：提高字符串的操作效率，而且代码编写特别简洁
* StringJoiner 的构造方法
* 1、public StringJoiner(间隔符号)：创建一个 StringJoiner 对象，指定拼接时的间隔符号
* 2、public StringJoiner(间隔符号，开始符号，结束符号)：创建一个 StringJoiner 对象，指定拼接时的间隔符号、开始符号、结束符号
* StringJoiner sj = new StringJoiner("---"): 1---2---3
* StringJoiner sj = new StringJoiner(", ", "【", "】")：【1，2，3】
* StringJoiner 的成员方法
* 1、add(添加的内容)：添加数据，并返回对象本身
* 2、length()：返回长度，字符出现的个数
* 3、toString()：返回一个字符串，该字符串就是拼接之后的结果

## String、StringBuilder、StringJoiner 总结
* String：表示字符串的类，定义了很多操作字符串的方法
* StringBuilder：一个可变的操作字符串的容器，可以高效的拼接字符串，还可以将容器里面的内容反转
* StringJoiner：JDK8出现的一个可变的操作字符串的容器，可以高效，方便的拼接字符串，在拼接的时候，可以指定间隔符号，开始符号，结束符号

## 字符串原理
* 字符串存储的内存原理
* 1、直接赋值会复用字符串常量池中的
* 2、new 出来不会复用，而是在堆中开辟一个新的空间
* == 号比较的到底是什么？
* 1、基本数据类型比较数据值
* 2、引用数据类型比较地址值
* 字符串拼接的底层原理
* 1、如果没有变量参与，都是字符串直接相加，编译之后就是拼接之后的结果，会复用串池中的字符串
* 2、如果有变量参与，每一行拼接的代码，都会在内存中创建新的字符串，浪费内存
* 3、字符串拼接的时候，如果有变量：
* 一、JDK8以前：系统底层会自动创建一个 StringBuilder 对象，然后再调用其 append 方法完成拼接。拼接后，再调用其 toString 方法转换为 String 类型，而 toString 方法的底层是直接 new 了一个字符串对象。
* 二、JDK8版本：系统会预估要字符串拼接之后的总大小，把要拼接的内容都放在数组中，此时也是产生一个新的字符串。
* 4、如果很多字符串变量拼接，不要直接 + 。在底层会创建多个对象，浪费时间，浪费性能
* StringBuilder 提高效率原理图
* 1、所有要拼接的内容都会往 StringBuilder 中放，不会创建很多无用的空间，节约内存，容器里内容是可以改变的
* StringBuilder 源码分析
* 1、默认创建一个长度为 16 的字节数组
* 2、添加的内容长度小于16，直接存
* 3、添加的内容大于 16 会扩容（原来的容量*2+2）
* 4、如果扩容之后还不够，以实际长度为准

## 看到要修改字符串的内容可以有两个办法
* 1、用 substring 进行截取，把左边的字符截取出来拼接到右边去
* 2、可以把字符串先变成一个字符数组，然后调整字符数组里面的数据，最后再把字符数组变成字符串
* str.toCharArray() 把 字符串变成字符数组
