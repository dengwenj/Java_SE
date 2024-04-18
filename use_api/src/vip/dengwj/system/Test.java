package vip.dengwj.system;

public class Test {
    public static void main(String[] args) {
        // 静态方法 exit：终止挡圈运行的 java 虚拟机
        // currentTimeMillis 返回当前系统的时间毫秒值形式
        // arraycopy(数据源数组, 起始索引, 目的地数组, 起始索引, 拷贝个数)  数组拷贝

        // System.exit(0);

        // System.out.println(System.currentTimeMillis()); // 1713446554565

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = new int[10];

        System.arraycopy(arr, 0, arr2, 3, 4); // 0 0 0 1 2 3 4 0 0 0
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        // 细节：
        // 1、如果数据源数组和目的地数组都是基本数据类型，那么二者的类型必须保持一致，否则会报错
        // 2、在拷贝的时候需要考虑数组的长度，如果超出范围也会报错
        // 3、如果数据源数组和目的地数组都是引用数据类型，那么子类类型可以赋值给父类类型
        // System.arraycopy(子类, 0, 父类, 3, 4); // 0 0 0 1 2 3 4 0 0 0
    }
}
