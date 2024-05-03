## File
* File 对象表示一个路径，可以是文件的路径、也可以是文件夹的路径
* 这个路径可以是存在的，也允许时不存在的

## 绝对路径和相对路径是什么意思
* 绝对路径是带盘符的
* 相对路径是不带盘符的，默认到当前项目下去找

## File 三种构造方法的作用
* public File(String pathname); 根据文件路径创建文件对象
* public File(String parent, String child); 根据父路径名字符串和子路径名字符串创建文件对象
* public File(File parent, String child); 根据父路径对应文件对象和子路径名字符串创建文件对象
