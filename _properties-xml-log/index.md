## Properties
* 是一个 Map 集合（键值对集合）
* 核心作用：Properties 是用来代表属性文件的，通过 Properties 可以读写属性文件中的内容
* public Properties(); 用于构建 Properties 集合对象（空容器）

## 使用 Properties 读取属性文件里的键值对数据
* public void load(InputStream is); 通过字节输入流，读取属性文件里的键值对数据
* public void load(Reader reader); 通过字符输入流，读取属性文件里的键值对数据
* public String getProperties(String key); 根据键获取值
* public Set<String> stringPropertyNames(); 获取全部键的集合（其实就是 keySet 方法的效果）

## 使用 Properties 把键值对数据写出到属性文件里去
* public Object setProperty(String key, String value); 保存键值对数据到 Properties 对象中去
* public void store(OutputStream os, String comments); 把键值对数据，通过字节输出流写出到属性文件里去
* public void store(Writer w, String comments); 把键值对数据，通过字符输出流写出到属性文件里去
