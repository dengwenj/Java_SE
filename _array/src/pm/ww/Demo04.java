package pm.ww;

public class Demo04 {
    public static void main(String[] args) {
        // 动态初始化
        // 格式：数据类型[] 数组名 = new 数据类型[数组的长度];
        // 在创建的时候，由我们自己指定数组的长度，由虚拟机给出默认的初始化值
        String[] arr1 = new String[10];
        arr1[0] = "朴睦";
        arr1[1] = "王小波";
        arr1[2] = "李雷";
        System.out.println(arr1[0]); // 朴睦
        System.out.println(arr1[1]); // 王小波
        System.out.println(arr1[2]); // 李雷
        System.out.println(arr1[3]); // null

        // 数组默认初始化值的规律
        // 整数类型：默认初始化值为 0
        // 小数类型：默认初始化值为 0.0
        // 字符类型：默认初始化值为 '\u0000' 即空格
        // 布尔类型：默认初始化值为 false
        // 引用数据类型：默认初始化值为 null
    }
}
