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

## SimpleDateFormat 类作用
* 格式化：把时间变成我们喜欢的格式
* 解析：把字符串表示的时间变成 Date 对象

```java
package vip.dengwj.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat(); // 默认格式
        Date d1 = new Date();
        String format1 = sdf1.format(d1);
        System.out.println(format1); // 2024/4/20 下午9:11

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E"); // 指定格式
        String format2 = sdf2.format(d1);
        System.out.println(format2); // 2024-04-20 21:13:45 周六

        // 解析, 把字符串转换成 Date 对象
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = "2024-04-01 19:00:00";
        // s 要跟创建对象的指定格式一样
        Date date = sdf3.parse(s);
        System.out.println(date.getTime()); // 1711969200000
    }
}
```

## Calendar 概述
* Calendar 代表了系统当前时间的日历对象，可以单独修改、获取时间中的年，月，日
* 细节：Calendar 是一个抽象类，不能直接创建对象

## 如何获取对象
* 通过静态方法 getInstance 方法获取对象

## 常见方法
* gitTime()：获取日期对象
* setTime(Date date)：给日历设置日期对象
* getTimeInMillis()：拿到时间毫秒值
* setTimeInMillis(long millis)：给日历设置时间毫秒值
* get(int field)：取日历中的某个字段信息
* set(int field, int value)：修改日历的某个字段信息
* add(int field, int amount)：为某个字段增加/减少指定的值

## 细节点
* 日历类中月份的范围：0~11
* 日历类中星期的特点：星期日是一周中的第一天

## ZoneId 时区
```java
package vip.dengwj.zoneId;

import java.time.ZoneId;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        // ZoneId 时区

        // 获取 java 中支持的所有时区
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(availableZoneIds);
        System.out.println(availableZoneIds.size()); // 603

        // 获取系统默认时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId); // Asia/Shanghai

        // 获取一个指定时区
        ZoneId of = ZoneId.of("Asia/Macau");
        System.out.println(of); // Asia/Macau
    }
}
```

## Instant 标准时间
```java
package vip.dengwj.instant;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Test {
    public static void main(String[] args) {
        // Instant  按照标准时间

        // 获取当前时间的 Instant 对象(标准时间)
        Instant now = Instant.now();
        System.out.println(now); // 2024-04-21T03:31:21.455521Z

        // 根据（秒/毫秒/纳秒）获取 Instant 对象
        Instant instant = Instant.ofEpochMilli(1000);
        System.out.println(instant); // 1970-01-01T00:00:01Z
        Instant instant1 = Instant.ofEpochSecond(3);
        System.out.println(instant1); // 1970-01-01T00:00:03Z
        Instant instant2 = Instant.ofEpochSecond(1, 1000000000);
        System.out.println(instant2); // 1970-01-01T00:00:02Z

        // 指定时区
        ZonedDateTime zonedDateTime = now.atZone(ZoneId.systemDefault());
        System.out.println(zonedDateTime); // 2024-04-21T11:35:40.221447+08:00[Asia/Shanghai]

        // 判断
        Instant instant3 = Instant.ofEpochMilli(0L);
        Instant instant4 = Instant.ofEpochMilli(1000L);
        // instant3 时间在不在 instant4 时间的后面
        boolean after = instant3.isAfter(instant4);
        System.out.println(after); // false
        // instant3 时间在不在 instant4 时间的前面
        boolean before = instant3.isBefore(instant4);
        System.out.println(before); // true

        // 减少时间
        Instant instant5 = Instant.ofEpochMilli(3000L);
        Instant instant6 = instant5.minusMillis(1000L);
        System.out.println(instant6); // 1970-01-01T00:00:02Z

        // 增加时间
        Instant instant7 = instant5.plusMillis(1000L);
        System.out.println(instant7); // 1970-01-01T00:00:04Z
    }
}
```

## ZoneDateTime 带时区的时间
```java
package vip.dengwj.zoneDateTime;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Test {
    public static void main(String[] args) {
        // ZoneDateTime 带时区的时间

        // 获取当前时间的 ZoneDateTime 对象
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now); // 2024-04-21T11:47:25.154015+08:00[Asia/Shanghai]

        // 获取指定时间的 ZoneDateTime 对象
        ZonedDateTime of = ZonedDateTime.of(2024, 4, 21, 11, 49, 5, 0, ZoneId.systemDefault());
        System.out.println(of); // 2024-04-21T11:49:05+08:00[Asia/Shanghai]
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(Instant.now(), ZoneId.of("Asia/Shanghai"));
        System.out.println(zonedDateTime); // 2024-04-21T11:50:35.709909+08:00[Asia/Shanghai]

        // 修改时间
        ZonedDateTime zonedDateTime1 = ZonedDateTime.ofInstant(Instant.ofEpochMilli(0L), ZoneId.systemDefault());
        ZonedDateTime zonedDateTime2 = zonedDateTime1.withYear(2024);
        System.out.println(zonedDateTime2); // 2024-01-01T08:00+08:00[Asia/Shanghai]
        ZonedDateTime zonedDateTime3 = zonedDateTime1.withMonth(5);
        System.out.println(zonedDateTime3); // 1970-05-01T08:00+08:00[Asia/Shanghai]

        // 减少时间
        ZonedDateTime zonedDateTime4 = zonedDateTime2.minusYears(1);
        System.out.println(zonedDateTime4); // 2023-01-01T08:00+08:00[Asia/Shanghai]

        // 增加时间
        ZonedDateTime zonedDateTime5 = zonedDateTime2.plusYears(2);
        System.out.println(zonedDateTime5); // 2026-01-01T08:00+08:00[Asia/Shanghai]

        // JDK8新增的时间对象都是不可变的
        // 如果我们修改了，减少了，增加了时间
        // 那么调用者是不会发生改变的，产生一个新的时间
    }
}
```

## DateTimeFormatter 用于时间的格式化和解析
```java
package vip.dengwj.dateTimeFormatter;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Test {
    public static void main(String[] args) {
        // DateTimeFormatter 用于实践的格式化和解析

        // 解析/格式化器
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss E a");
        ZonedDateTime now = ZonedDateTime.now();
        // 格式化 format(时间对象)
        String format = dateTimeFormatter.format(now);
        System.out.println(format); // 2024-04-21 12:00:17 周日 下午
    }
}
```

## 包装类
* 基本数据类型对应的引用数据类型
* 用一个对象，把基本数据类型给包起来

## JDK5以后对包装类新增了什么特性
* 自动装箱、自动拆箱

## 如何获取包装类对象
* 不需要 new, 不需要调用方法，直接赋值即可
* Integer i = 10; Integer i2 = 10; Integer i3 = i1 + i2

## 包装类的静态方法
```
// Integer 静态方法
// 得到二进制
String s = Integer.toBinaryString(100);
System.out.println(s); // 1100100
// 得到八进制
String s1 = Integer.toOctalString(100);
System.out.println(s1); // 144
// 得到十六进制
String s2 = Integer.toHexString(100);
System.out.println(s2); // 64

// 将字符串类型的整数转成 int 类型的整数
int i = Integer.parseInt("123");
System.out.println(i); // 123
System.out.println(i + 1); // 124
// 在类型转换的时候，括号中的参数只能是数字不能是其他
// 8种包装类当中，除了 Character 都有对应的 parseXxx 的方法，进行类型转换
String str = "true";
boolean b = Boolean.parseBoolean(str);
System.out.println(b); // true
```