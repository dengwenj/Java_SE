package pm.ww13;

public class Demo2 {
    public static void main(String[] args) {
        // 数组地址值: 表示数组在内存中的位置
        int[] arr1 = {1, 2, 3, 4};
        double[] arr2 = {1.1, 1.2, 1.3};

        System.out.println(arr1); // [I@36baf30c
        System.out.println(arr2); // [D@7a81197d
        // [I@36baf30c 含义
        // [：表示当前是一个数字
        // I：表示当前数组里面的元素都是 int 类型的
        // @：表示一个间隔符号
        // 36baf30c：才是数组真正的地址值（十六进制）

        // 数组元素访问
        // 格式：数组名[索引]
        System.out.println(arr1[0]);

        // 把数据存储到数组当中
        // 格式：数组名[索引] = 具体数据/变量
        System.out.println(arr1[1]);
        arr1[1] = 200;
        System.out.println(arr1[1]);

        // 数组的遍历
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
