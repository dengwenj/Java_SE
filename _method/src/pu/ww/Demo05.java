package pu.ww;

import java.util.Arrays;

public class Demo05 {
    public static void main(String[] args) {
        // 1、设计一个方法用于数组遍历，要求遍历的结果是在一行上的
        int[] arr = {11, 22, 33, 44, 55};
        arrEach(arr);

       System.out.println(); // 只换行

        // 2、设计一个方法求数组最大值，并将最大值返回
        int max = maxArr(arr);
        System.out.println(max);

        // 数组中是否存在某个数
        boolean res1 = isExist(11, arr);
        System.out.println("这个数是否存在：" + res1);

        // 复制数组，将数组 arr 中从索引 from 包含开始，到索引 to 结束不包含的元素复制到新数组中，将其返回
        int[] copyArr = copyOfRange(arr, 1, 3);
        System.out.println(Arrays.toString(copyArr));
    }

    public static void arrEach(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.print("]");
    }

    public static int maxArr(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static boolean isExist(int num, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) return true;
        }

        return false;
    }

    public static int[] copyOfRange(int[] arr, int from, int to) {
        int[] copyArr = new int[to - from];

        // 也可以伪造索引思想
        // int index = 0;
        for (int i = from; i < to; i++) {
            copyArr[i - from] = arr[i];
            // index++;
        }

        return copyArr;
    }
}
