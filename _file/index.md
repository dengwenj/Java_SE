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

## File 的常见成员方法（判断、获取）
* public boolean isDirectory(); 判断此路径名表示的 File 是否为文件夹
* public boolean isFile(); 判断此路径名表示的 File 是否为文件
* public boolean exists(); 判断此路径名表示的 File 是否存在
* public long length(); 返回文件的大小（字节数量）
* public String getAbsolutePath(); 返回文件的绝对路径
* public String getPath(); 返回定义文件时使用的路径
* public String getName(); 返回文件的名称，带后缀
* public long lastModified(); 返回文件的最后修改时间（时间毫秒值）

## File 的常见成员方法（创建、删除）
* public boolean createNewFile(); 创建一个新的空的文件
* public boolean mkdir(); 创建单级文件夹
* public boolean mkdirs(); 创建多级文件夹
* public boolean delete(); 删除文件、空文件夹
* delete 方法默认只能删除文件和空文件夹，delete 方法直接删除不走回收站

## File 的常见成员方法（获取并遍历）
* public File[] listFiles(); 获取当前该路径下所有的内容
* 当调用者 File 表示的路径不存在时，返回 null
* 当调用者 File 表示的路径是文件时，返回 null
* 当调用者 File 表示的路径是一个空文件夹时，返回一个长度为 0 的数组
* 当调用者 File 表示的路径是一个有内容的文件夹时，将里面所有文件和文件夹的路径放在 File 数组中返回
* 当调用者 File 表示的路径是一个有隐藏文件的文件夹时，将里面所有文件和文件夹的路径放在 File 数组中返回，包含隐藏文件
* 当调用者 File 表示的路径是需要权限才能访问的文件夹时，返回 null