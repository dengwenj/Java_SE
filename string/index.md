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