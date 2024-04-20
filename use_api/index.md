## Runtime
* getRuntime 静态方法：当前系统的运行环境
* exit 停止虚拟机，通过方法去调用（成员方法）
* 获取 CPU 的线程数，r.availableProcessors()
* JVM 能从系统中获取总内存打下，单位 byte。maxMemory()
* JVM 已经从系统中获取总内存大小，单位 byte。totalMemory()
* JVM 剩余内存大小。freeMemory()
* 运行 cmd。r.exec("notepad");

## Object
* Object 是 java 中的顶级父类。所有的类都直接或间接的继承于 Object 类
* Object 类中的方法可以被所有子类访问
* public String toString() 返回对象的字符串表示形式
* public boolean equals(Object obj) 比较两个对象是否相等
* protected Object clone(int a) 对象克隆

## 克隆
* 浅克隆：不管对象内部的属性是基本数据类型还是引用数据类型，都完全拷贝过来
* 深克隆：基本数据类型拷贝过来，字符串复用，引用数据类型会重新创建新的

## 总结
* toString(): 一般会重写，打印对象时打印属性
* equals(): 比较对象时会重写，比较对象属性值是否相同
* clone(): 默认浅克隆

## Objects
* Objects 是一个对象工具类，提供了一些操作对象的方法
* public static boolean equals(Object a, Object b) 先做非空判断，比较两个对象
* public static boolean isNull(Object obj) 判断对象是否为 null，为 null 返回 true，反之
* public static boolean nonNull(Object obj) 判断对象是否为 null，跟 isNull 的结果相反

## BigInteger
* BigInteger 表示一个大整数

## BigInteger 构造方法
* public BigInteger(int num, Random r) 获取随机大整数，范围：【0 ~ 2 的 num 次方 -1】
* public BigInteger(String val) 获取指定的大整数
* public BigInteger(String val, int radix) 获取指定进制的大整数

## BigInteger 静态方法
* public static BigInteger valueOf(long val) 静态方法获取 BigInteger 的对象，内部有优化

## BigInteger 构造方法小结
* 如果 BigInteger 表示的数字没有超出 long 的范围，可以用静态方法获取
* 如果 BigInteger 表示的超出 long 的范围，可以用构造方法获取
* 对象一旦创建，BigInteger 内部记录的值不能发生改变
* 只要进行计算都会产生一个新的 BigInteger 对象

## BigInteger 存储上限
* 数组中最多能存储元素个数：21亿多
* 数组中每一位能表示的数字：42亿多
* BigInteger 能表示的最大数字为：42亿的21亿次方

## 总结
* BigInteger b1 = new BigInteger("整数");
* BigInteger b2 = BigInteger.valueOf(10);
* 一些方法... b1.add(b2)

## BigDecimal 构造方法
* public BigDecimal(double val)
* public BigDecimal(String val)

## BigDecimal 静态方法
* public static BigDecimal valueOf(double val)

```java
package vip.dengwj.bigDecimal;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        // 1、通过传递 double 类型的小数来创建对象
        // 细节：这种方式有可能是不精确的，不建议使用
        BigDecimal bd1 = new BigDecimal(0.1);
        System.out.println(bd1); // 0.1000000000000000055511151231257827021181583404541015625

        // 2、通过传递字符串表示的小数来创建对象
        BigDecimal bd2 = new BigDecimal("0.1");
        System.out.println(bd2); // 0.1

        // 3、通过静态方法获取对象
        BigDecimal bd3 = BigDecimal.valueOf(10);
        System.out.println(bd3); // 10
        BigDecimal bd4 = BigDecimal.valueOf(1.1);
        System.out.println(bd4); // 1.1
        // 细节：
        // 1、如果要表示的数字不大，没有超出 double 的取值范围，建议使用静态方法
        // 2、如果要表示的数字比较大，超出了 double 的取值范围，建议使用构造方法 字符串方式
        // 3、如果传递的是 0-10 之间的整数那么方法会返回已经创建好的对象，不会重新 new
        BigDecimal bd5 = BigDecimal.valueOf(5);
        BigDecimal bd6 = BigDecimal.valueOf(5);
        System.out.println(bd5 == bd6); // true
        BigDecimal bd7 = bd5.add(bd6);
        System.out.println(bd7); // 10
    }
}
```

## BigDecimal 的作用是什么？
* 表示较大的小数和解决小数运算精度失真问题

## BigDecimal 的对象如何获取？
* BigDecimal bd1 = new BigDecimal("较大的小数");
* BigDecimal bd2 = BigDecimal.valueOf(0.1);

## 常见操作
* 加：add
* 减：subtract
* 乘：multiply
* 除：divide（四舍五入：RoundingMode.HALF_UP）

## 正则表达式的作用
* 1、校验字符串是否满足规则
* 2、在一段文本中查找满足要求的内容

## 字符类（只匹配一个字符）
* 【abc】只能是 a,b或c
* 【^abc】除了a,b,c 之外的任何字符
* 【a-zA-Z】a到z，A到Z，包括（范围）
* 【a-d【m-p】】a到d，或m到p
* 【a-z&&【def】】a-z和def 的交集，，为：d，e，f
* 【a-z&&【^bc】】a-z和非bc的交集（等同于【ad-z】）
* 【a-z&&【^m-p】】a到z和除了m到p的交集（等同于【a-lq-z】）

## 预定义字符（只匹配一个字符）
* . 任何字符
* \d 一个数字：【0-9】
* \D 非数字：【^0-9】
* \s 一个空白字符：【\t\n\xOB\f\r】
* \S 非空白字符：【^\s】
* \w 【a-zA-Z_0-9】英文、数字、下划线
* \W 【^\w】一个非单词字符

## 数量词
* X? X，一次或0次
* X* X, 零次或多次
* X+ X, 一次或多次
* X{n} X, 正好n次
* X{n,} X，至少n次
* X{n,m} X，至少n但不超过m次

## 字符串中方法传正则表达式的
* public String replaceAll(String regex, String newStr)
* public String[] split(String regex)

## 捕获分组
* 捕获分组就是用括号括起来，后续继续使用本组的数据
* 正则内部使用：\\组号
* 正则外部使用：$组号

## 正则表达式中分组有两种
* 捕获分组、非捕获分组

## 捕获分组
* 可以获取每组中的内容反复使用

## 组号的特点
* 从1开始，连续不间断
* 以左括号为基准，最左边的是第一组

## 非捕获分组
* 分组之后不需要再用本组数据，仅仅把数据括起来，不占组号
* (?:) (?=) (?!) 都是非捕获分组

## 如何创建日期对象
* Date date = new Date()
* Date date = new Date(指定毫秒值)

## 如何修改时间对象中的毫秒值
* date.setTime(毫秒值)

## 如何获取时间对象中的毫秒值
* date.getTime()