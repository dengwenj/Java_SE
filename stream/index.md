## Stream 流的作用
* 结合了 Lambda 表达式，简化集合、数组的操作

## 单列集合
* default Stream<E> stream(); Collection 中的默认方法

## 双列集合
* 无法直接使用 stream 流，需要用 keySet，entrySet 转成单列集合

## 数组
* public static <T> Stream<T> stream(T[] array); Arrays 工具类中的静态方法

## 一堆零散数据
* public static<T> Stream<T> of(T... values); Stream 接口中的静态方法
* Stream 接口中静态方法 of 的细节：
* 方法的形参是一个可变参数，可以传递一堆零散的数据，也可以传递数组
* 但是数组必须是引用数据类型的，如果传递基本数据类型，是会把整个数组当做一个元素，放到 Stream 当中
