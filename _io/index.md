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
        FileInputStream fis = new FileInputStream("_io/demo.txt");

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

## ASCII、GBK 字符集
* 在计算机中，任意数据都是以二进制的形式来存储的
* 计算机中最小的存储单元是一个字节
* ASCII 字符集中，一个英文占一个字节
* 简体中文版 windows，默认使用 GBK 字符集
* GBK 字符集完全兼容 ASCII 字符集
* 一个英文占一个字节，二进制第一位是0
* 一个中文占两个字节，二进制高位字节的第一位是1

## Unicode 字符集的 UTF-8 编码格式
* 一个英文占一个字节，二进制第一位是 0，转成十进制是正数
* 一个中文占三个字节，二进制第一位是 1，第一个字节转成十进制是负数

## 如何不产生乱码？
* 1、不要用字节流读取文本文件
* 2、编码解码时使用同一个码表，同一个编码方式

## 字符流(可以解决乱码问题)
* 字符流的底层其实就是字节流
* 字符流 = 字节流 + 字符集
* 特点：
* 1、输入流：一次读一个字节，遇到中文时，一次读多个字节
* 2、输出流：底层会把数据按照指定的编码方式进行编码，变成字节再写到文件中
* 使用场景：对于纯文本文件进行读写操作

## FileReader
* 1、创建字符输入流对象：如果文件不存在，就直接报错
* 2、读取数据
* 细节一：默认也是一个字节一个字节的读取的，如果遇到中文就会一次读取多个
* 细节二：在读取之后，方法的底层还会进行解码并转成十进制，最终把这个十进制作为返回值
* 3、释放资源

## FileWriter 书写细节
* 1、创建字符输出流对象
* 2、写数据
* 细节：如果 write 方法的参数是整数，但是实际上写到本地文件中的是整数在字符集上对应的字符
* 释放资源

## FileWriter 构造方法
* public FileWriter(File file); 创建字符输出流关联本地文件
* public FileWriter(String pathname); 创建字符输出流关联本地文件
* public FileWriter(File file, boolean append); 创建字符输出流关联本地文件，续写
* public FileWriter(String file, boolean append); 创建字符输出流关联本地文件，续写
* 读取数据
* void write(int c); 写出一个字符
* void write(String str); 写出一个字符串
* void write(String str, int off, int len); 写出一个字符串的一部分
* void write(char[] cbuf); 写出一个字符数组
* void write(char[] cbuf, int off, int len); 写出字符数组的一部分

## 字符流原理解析
* 1、创建字符输入流对象
* 底层：关联文件，并创建缓冲区（长度为 8192 的字节数组）
* 2、读取数据
* 底层：
* 一：判断缓冲区中是否有数据可以读取
* 二：缓冲区没有数据：就从文件中获取数据，装到缓冲区中，每次尽可能装满缓冲区，如果文件中也没有数据了，返回-1
* 三：缓冲区有数据：就从缓冲区中读取
* 空参的 read 方法：一次读取一个字节，遇到中文一次读取多个字节，把字节解码并转成十进制返回
* 有参的 read 方法：把读取字节，解码，强转三步合并了，强转之后的字符放到数组中

## flush 和 close 方法
* public void flush(); 将缓冲区中的数据，刷新到本地文件中
* public void close(); 释放资源/关流
* flush 刷新：刷新之后，还可以继续往文件中写出数据
* close 关流：断开通道，无法再往文件中写出数据

## 字节流和字符流的使用场景
* 字节流：拷贝任意类型的文件
* 字符流：读取纯文本文件中的数据；往纯文本文件中写出数据

## 字节缓冲流
* public BufferedInputStream(InputStream is); 把基本流包装成高级流，提高读取数据的性能
* public BufferedOutputStream(OutputStream os); 把基本流包装成高级流，提高写出数据的性能
* 原理：底层自带了长度为 8192 的缓冲区提高性能
```java
package pm.bufferediostream;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        // 创建缓冲流的对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("_io/src/pm/bufferediostream/test.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("_io/src/pm/bufferediostream/copy.txt"));

        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }

        bos.close();
        bis.close();
    }
}
```

## 字节缓冲流原理
* 就是在内存中创建了 长度为 8192 byte[], 没有频繁的去和硬盘操作，节省性能

## 字符缓冲流
* public BufferedReader(Reader r); 把基本流变成高级流
* public BufferedWriter(Writer r); 把基本流变成高级流
* 原理：底层自带了长度为 8192 的缓冲区提高性能

## 字符缓冲流特有方法
* 字符缓冲输入流特有方法
* public String readLine(); 读取一行数据，如果没有数据可读了，会返回 null
* 字符缓冲输出流特有方法
* public void newLine(); 跨平台的换行

## 缓冲流有几种？
* 字节缓冲输入流：BufferedInputStream
* 字节缓冲输出流：BufferedOutputStream
* 字符缓冲输入流：BufferedReader
* 字符缓冲输出流：BufferedWriter

## 缓冲流为什么能提高性能
* 缓冲流自带长度为 8192 的缓冲区
* 可以显著提高字节流的读写性能
* 对于字符流提升不明显，对于字符缓冲流而言关键是两个特有的方法

## 字符缓冲流两个特有的方法是什么？
* 字符缓冲输入流：BufferedReader：readLine()
* 字符缓冲输出流：BufferedWriter：newLine()

## 原则
* 什么时候用，什么时候创建。什么时候不用，什么时候关闭

## 转换流(是字符流。可以把字节流转成字符流)
* 是字符流和字节流之间的桥梁
* 作用：
* 1、指定字符集读写
* 2、字节流想要使用字符流中的方法

## InputStreamReader(字符输入流)
* InputStreamReader isr = new InputStreamReader(new FileInputStream("_io/src/pm/convertstream/test.txt"), "GBK");

## 转换流的名字是什么？
* 字符转换输入流：InputStreamReader
* 字符转换输出流：OutputStreamWriter

## 序列化流/对象操作输出流
* 可以把 java 中的对象写到本地文件中
* public ObjectOutputStream(OutputStream out); 把基本流包装成高级流
* public final void writeObject(Object obj); 把对象序列化（写出）到文件中去
* 细节：使用对象输出流将对象保存到文件时会出现 NotSerializableException 异常
* 解决方案：需要让 javabean 类实现 Serializable 接口
