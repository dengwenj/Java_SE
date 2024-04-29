## 双列集合的特点
* 1、双列集合一次需要存一对数据，分别为键和值
* 2、键不能重复，值可以重复
* 3、键和值是一一对应的，每一个键只能找到自己对应的值
* 4、键 + 值这个整体我们称之为 "键值对" 或者 "键值对对象"，在 java 中叫做 "Entry对象"

## Map
* Map 是双列集合的顶层接口，它的功能是全部双列集合都可以继承使用的
* V put(K key, V value); 添加元素
* V remove(Object key); 根据键删除键值对元素
* void clear(); 移除所有的键值对元素
* boolean containsKey(Object key); 判断集合是否包含指定的键
* boolean containsValue(Object value); 判断集合是否包含指定的值
* boolean isEmpty(); 判断集合是否为空
* int size(); 集合的长度，也就是集合中键值对的个数

## Map 的遍历方式
* 1、键找值
* 2、键值对
* 3、Lambda 表达式
