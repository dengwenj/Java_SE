## Collection 单列集合（List、Set）
* Collection 是单列集合的祖宗接口，它的功能是全部单列集合都可以继承使用的
* public boolean add(E e); 天假
* public void clear(); 清空
* public boolean remove(E e); 删除
* public boolean contains(Object obj); 判断是否包含
* public boolean isEmpty(); 判断是否为空
* public int size(); 集合长度
* Collection 是一个接口，不能直接创建它的对象，只能创建它实现类的对象

## List 系列集合
* 添加的元素是有序、可重复、有索引

## Set 系列集合
* 添加的元素是无序、不重复、无索引

## Collection 的遍历方式
* 迭代器遍历
* 增强 for 遍历
* Lambda 表达式遍历

## 迭代器遍历
* 迭代器在 java 中的类是 Iterator，迭代器是集合专用的遍历方式，是通过指针和移动的方式去获取集合中的每个元素，不依赖索引

## Collection 集合获取迭代器
* Iterator<E> iterator() 返回迭代器对象，默认指向当前集合的第 0 个

## Iterator 中的常用方法
* boolean hasNext() 判断当前位置是否有元素，有元素返回 true，没有元素返回 false
* E next() 获取当前位置的元素，并将迭代器对象移向下一个位置

## 迭代器总结
* 迭代器在遍历集合的时候是不依赖索引的
* 迭代器的四个细节：
* 1、如果当前位置没有元素，还要强行获取，会报 NoSuchElementException
* 2、迭代器遍历完毕，指针不会复位
* 3、循环中只能用一次 next 方法
* 4、迭代器遍历时，不能用集合的方法进行增加或删除，如果要删除，可以用迭代器提供的 remove 方法进行删除

## 增强 for 遍历
* 增强 for 的底层就是迭代器没了简化迭代器的代码书写
* 是 jdk5 之后出现的，其内部原理就是一个 Iterator 迭代器
* 所有的单列集合和数组才能用增强 for 进行遍历
* for (元素的数据类型 变量名 : 数组或者单列集合) {}

## Lambda 表达式遍历
* default void forEach(Consumer<? super T> action) 结合 Lambda 遍历集合
* 