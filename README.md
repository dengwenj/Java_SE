# java 基础学习

## 1. Java 的三大分类
* JavaSE
* JavaEE: java 语言的，用于 Web 方向的网站开发
* JavaME

## 编程、编译、运行
* 编程：java 程序员写的 .java 代码，c 程序员写的 .c 代码
* 编译：机器只认识 0011 的机器语言，把 .java .c 的代码做转化让机器认识的过程
* 运行：让机器执行编译后的指令

## Java 跨平台原理
* Java 语言的跨平台是通过虚拟机实现的
* Java 语言不是直接运行在操作系统里面的，而是运行在 Java 虚拟机里面的
* 针对于不同的操作系统，安装不同的虚拟机就可以了
* Java 源代码--javac 编译器--字节码文件（.class）--不同平台虚拟机--不同平台操作系统

## JDK 是什么？有哪些内容组成？
* JDK 是 Java 的开发工具包
* 组成
* 1、JVM 虚拟机：Java 程序运行的地方
* 2、核心类库：Java 已经写好的东西，我们可以直接用
* 3、开发工具：javac(编译工具)、java(运行工具)、jdb(调式工具)、jhat(内存分析工具)

## JRE 是什么？有哪些内容组成？
* JRE 是 Java 的运行时环境
* 组成: JVM、核心类库、运行工具(Java)

## JDK、JRE、JVM 三者的包含关系
* JDK 包含了 JRE
* JRE 包含了 JVM

## API
* API(Application Programming Interface)：应用程序编程接口
* API 就是别人已经写好的东西，我们不需要自己编写，直接使用即可
* Java API：指的就是 JDK 中提供的各种功能的 Java 类
