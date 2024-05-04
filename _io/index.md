## 什么是 io 流？
* 存储和读取数据的解决方案
* i：input，o：output

## io 流的作用
* 用于读写数据（本地文件、网络）

## io 流按照流向可以分类哪两种流？
* 输出流：程序 -> 文件
* 输入流：文件 -> 程序

## io 流按照操作文件的类型可以分类哪两种流？
* 字节流：可以操作所有类型的文件
* 字符流：只能操作纯文本文件

## 什么是纯文本文件？
* 用系统自带的记事本打开并且能读懂的文件
* txt文件、md文件、xml文件、lrc文件等

## 体系
*                      io流体系
*           字节流                   字符流
* InputStream  OutputStream    Reader   Writer   抽象类

## FileOutputStream
* 操作本地文件的字节输出流，可以把程序中的数据写到本地文件中
* 1、创建字节输出流对象，2、写数据，3、释放资源

## FileOutputStream 书写细节
* 1、创建字节输出流对象
* 细节一：参数是字符串表示的路径或者 File 对象都是可以的
* 细节二：如果文件不存在会创建一个新的文件，但是要保证父级路径是存在的
* 细节三：如果文件已经存在，则会清空文件
* 2、写数据
* 细节：write 方法的参数是整数，但是实际上写到本地文件中的是整数在 ASCII 上对应的字符
* 3、释放资源
* 细节：每次使用完流之后都要释放资源

## FileOutputStream 写数据的3种方式
* void write(int b); 一次写一个字节数据
* void write(byte[] b); 一次写一个字节数组数据
* void write(byte[] b, int off, int len); 一次写一个字节数组的部分数据

## FileOutputStream 的作用
* 可以把程序中的数据写到本地文件上，是字节流的基本流

## 书写步骤
* 创建对象，写出数据，释放资源

## 三步操作的细节
* 创建对象：文件存在、文件不存在、追加写入
* 写出数据：写出整数、写出字节数组、换行写
* 释放资源：关闭通道

## FileInputStream
* 操作本地文件的字节输入流，可以把本地文件中的数据读取到程序中来

## 书写步骤
* 创建字节输入流对象，读数据，释放资源

## FileInputStream 书写细节
* 1、创建字节输入流对象
* 细节一：如果文件不存在，就直接报错
* 2、读取数据
* 细节一：一次读一个字节，读出来的是数据在 ASCII 上对应的数字
* 细节二：读到文件末尾了，read 方法返回 -1
* 3、释放资源
* 细节一：每次使用完流必须要释放资源

## FileInputStream 一次读多个字节
* public int read(); 一次读一个字节数据
* public int read(byte[] buffer); 一次读一个字节数组数据
* 一次读一个字节数组的数据，每次读取会尽可能把数组装满
```java
package pm.fileinputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class Test3 {
    public static void main(String[] args) throws IOException {
        //一次读多个字节
        FileInputStream fis = new FileInputStream("_io/test.txt");

        byte[] bytes = new byte[2];
        // 返回值：一个读了多少个字节
        // 读取的数据会放入到 bytes 里
        int len1 = fis.read(bytes);
        String str1 = new String(bytes, 0, len1);
        System.out.println(len1); // 2
        System.out.println(str1); // ab

        // bytes 会覆盖前面的数据
        int len2 = fis.read(bytes);
        String str2 = new String(bytes, 0, len2);
        System.out.println(len2); // 2
        System.out.println(str2); // cd

        int len3 = fis.read(bytes);
        String str3 = new String(bytes, 0, len3);
        System.out.println(len3); // 1
        System.out.println(str3); // e
    }
}
```