package pm.ww13;

import java.util.Arrays;

public class Demo03 {
    public static void main(String[] args) {
        // 定义数组，静态初始化
        // 求和
        int sum = 0;
        int[] arr1 = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }
        System.out.println("和为：" + sum);

        // 能被 3 整除的数
        int count = 0;
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] % 3 == 0) {
                count++;
            }
        }
        System.out.println("能被 3 整除的数有" + count + "个");

        // 如果是奇数，则将当前数字扩大两倍
        // 如果是偶数，则将当前数字变成二分之一
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] % 2 == 0) {
                arr3[i] /= 2;
            } else {
                arr3[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr3));
    }
}
