## 集合和数组的对比
* 1、长度
* 2、存储类型
* 数组长度固定，集合长度可变
* 数组可以存基本数据类型，引用数据类型
* 集合可以存引用数据类型，存基本数据类型的话要先变成包装类

## 创建集合对象和成员方法
* ArrayList<String> list = new ArrayList<>();
* boolean list.add(E e): 添加元素，返回值表示是否添加成功
* boolean list.remove(E e): 删除指定元素，返回值表示是否删除成功
* E list.remove(int index): 删除指定索引的元素，返回被删除元素
* E list.set(int index, E e): 修改指定索引下的元素，返回原来的元素
* E list.get(int index): 获取指定索引的元素
* int list.size()： 集合的长度，也就是集合中元素的个数