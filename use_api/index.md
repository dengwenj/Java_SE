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