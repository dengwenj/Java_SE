## 什么是反射？
* 反射允许对成员变量，成员方法和构造方法的信息进行编程访问
* 反射就是可以从类里面拿东西
* 利用反射可以获取类里面的所有信息：
*     获取(从 class 字节码文件去获取的)      解剖
* 1、字段(成员变量)：获取修饰符、获取名字、获取类型、赋值/获取值
* 2、构造方法：获取修饰符、获取名字、获取形参、创建对象
* 3、成员方法：获取修饰符、获取名字、获取形参、获取返回值、抛出的异常、获取注解、运行方法

## 获取 class 对象的三种方式
* 1、Class.forName("全类名")
* 2、类名.class
* 3、对象.getClass()

## 利用反射获取构造方法
* Class 类中用于获取构造方法的方法
* Constructor<?>[] getConstructors(); 返回所有公共构造方法对象的数组
* Constructor<?>[] getDeclaredConstructors(); 返回所有构造方法对象的数组
* Constructor<T> getConstructor(Class<?>... parameterTypes); 返回单个公共构造方法对象
* Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes); 返回单个构造方法对象
* 
* Constructor 类中用于创建对象的方法
* setAccessible(boolean flag); 设置为 true，表示取消访问检查
* T newInstance(Object... initArgs); 根据指定的构造方法创建对象

## 利用反射获取成员变量
* Class 类中用于获取成员变量的方法
* Field[] getFields(); 返回所有公共成员变量对象的数组
* Field[] getDeclaredFields(); 返回所有成员变量对象的数组
* Field getField(String name); 返回单个公共成员变量对象
* Field getDeclaredField(String name); 返回单个成员变量对象
* 
* Field 类中用于创建对象的方法
* void set(Object obj, Object value); 赋值
* Object get(Object obj); 获取值

## 利用反射获取成员方法
* Class 类中用于获取成员方法的方法
* Method[] getMethods(); 返回所有公共成员方法对象的数组，包括继承的
* Method[] getDeclaredMethods(); 返回所有成员方法对象的数组，不包括继承的
* Method getMethod(String name, Class<?>... parameterTypes); 返回单个公共成员方法对象
* Method getDeclaredMethod(String name, Class<?>... parameterTypes); 返回单个成员方法对象
* 
* Method 类中用于创建对象的方法
* Object invoke(Object obj, Object... args); 运行方法
* 参数一：用 obj 对象调用该方法
* 参数二：调用方法传递的参数（没有可以不写）
* 返回值：方法的返回值（没有可以不写）