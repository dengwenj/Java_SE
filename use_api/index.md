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