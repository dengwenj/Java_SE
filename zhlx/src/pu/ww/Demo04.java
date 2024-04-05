package pu.ww;

import java.util.Arrays;

public class Demo04 {
    public static void main(String[] args) {
        // 数组元素的复制
        // 把一个数组中的元素复制到另一个新数组中去
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr1 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        System.out.println(Arrays.toString(arr1));
    }
}
