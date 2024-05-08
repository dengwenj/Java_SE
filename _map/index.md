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

## HashMap 的特点
* 1、HashMap 是 Map 里面的一个实现类
* 2、特点都是由键决定的：无序、不重复、无索引
* 3、HashMap 和 HashSet 底层原理是一样的，都是哈希表结构
* 4、依赖 hashCode 方法和 equals 方法保证键的唯一
* 5、如果键存储的是自定义对象，需要重写 hashCode 和 equals 方法，值不需要

## LinkedHashMap
* 由键决定：有序、不重复、无索引
* 这里的有序指的是保证存储和取出的元素顺序一致
* 原理：底层数据结构依然是哈希表，只是每个键值对元素又额外的多了一个双链表的机制记录存储的顺序

## TreeMap
* TreeMap 跟 TreeSet 底层原理一样，都是红黑树结构的
* 由键决定特性：不重复、无索引、可排序
* 可排序：对键进行排序
* 注意：默认按照键的从小到大进行排序，也可以自己规定键的排序规则

## TreeMap 代码书写两种排序规则
* 实现 Comparable 接口，指定比较规则
* 创建集合时传递 Comparator 比较器对象，指定比较规则
 
## TreeMap 集合的特点是怎样的？
* 不重复、无索引、可排序
* 底层基于红黑树实现排序，增删改查性能较好

## 添加元素的时候至少考虑三种情况
* 1、数组位置为null
* 2、数组位置不为 null，键不重复，挂在下面形成链表或者红黑树
* 3、数组位置不为 null，键重复，元素覆盖（只是把重复的那个值改变了）

## TreeMap 添加元素的时候，键是否需要重写 hashCode 和 equals 方法
* TreeMap 是不需要重写的

## HashMap 是哈希表结构的，JDK8 开始由数组，链表，红黑树组成的
* 既然有红黑树，HashMap 的键是否需要实现 Compareable 接口或者传递比较器对象呢？
* 不需要的，因为在 HashMap 的底层，默认是利用哈希值的大小关系来创建红黑树的

## TreeMap 和 HashMap 谁的效率高
* 如果是最坏情况，添加了很多个元素，很多个元素形成了链表，此时 TreeMap 的效率更高
* 但是这种情况出现的几率非常少，一般而言，还是 HashMap 的效率更高

## 在 Map 集合中，java 会提供一个如果键重复了，不会覆盖的 put 方法吗？
* 有：putIfAbsent

## 三种双列集合，以后如何选择？
* 默认使用 HashMap（效率最高）
* 如果要保证存取有序使用 LinkedHashMap
* 如果要进行排序使用 TreeMap

## 配置文件
* 好处1：可以把软件的设置永久化存储
* 好处2：如果我们要修改参数，不需要改动代码，直接修改配置文件就可以了

## 常见的配置文件
* XML、ini、properties、YAML

## properties
* properties 是一个双列集合，拥有 Map 集合所有的特点
* 重点：有一些特有的方法，可以把集合中的数据，按照键值对的形式写到配置文件中，也可以把配置文件中的数据，读取到集合中来
```java
package pm.prop;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws IOException {
        // Properties，写入到配置文件 store，读取配置文件 load
        Properties prop = new Properties();

        prop.put("朴睦", "24");
        prop.put("李雷", "20");
        prop.put("韩梅梅", "18");
        prop.put("她", "20");
        System.out.println(prop);

        // 写入到 properties 后缀文件
        FileWriter fw = new FileWriter("_map/src/pm/prop/test.properties");

        prop.store(fw, "test config file");
        fw.close();

        // 读取
        FileReader fr = new FileReader("_map/src/pm/prop/test.properties");
        prop.load(fr);
        fr.close();
        System.out.println(prop);
    }
}
```