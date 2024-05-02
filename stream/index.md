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

## Stream 流的中间方法
* Stream<T> filter(Predicate<? super T> predicate); 过滤
* Stream<T> limit(long maxSize); 获取前几个元素
* Stream<T> skip(long n); 跳过前几个元素
* Stream<T> distinct(); 元素去重，依赖（hashCode 和 equals 方法）
* static <T> Stream<T> concat(Stream a, Stream b); 合并a和b两个流为一个流
* Stream<R> map(Function<T, R> mapper); 转换流中的数据类型
* 注意1：中间方法，返回新的 Stream 流，原来的 Stream 流只能使用一次，建议使用链式编程
* 注意2：修改 Stream 流中的数据，不会影响原来集合或者数组中的数据
