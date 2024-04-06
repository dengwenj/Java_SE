package pu.ww;

import java.util.Arrays;

public class Demo08 {
    public static void main(String[] args) {
        // 解密
        int[] arr = {8, 3, 4, 6};
        // 反转
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr));

        // 由于加密是通过对 10 取余的方式
        // 所以在解密的时候需要判断，0-4之间 + 10，5-9之间不变
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] <= 4) {
                arr[i] += 10;
            }
        }

        // 再减5
        for (int i = 0; i < arr.length; i++) {
            arr[i] -= 5;
        }
        // 解密的结果
        System.out.println(Arrays.toString(arr)); // 1983
    }
}
