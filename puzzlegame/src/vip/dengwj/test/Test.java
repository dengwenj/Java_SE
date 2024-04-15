package vip.dengwj.test;

import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        // 把一个一维数组中的数据：0-15 打乱顺序
        // 然后再按照 4 个一组的方式添加到二维数组中
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int idx = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }
        System.out.println(Arrays.toString(arr));

        int[][] arr2 = new int[arr.length % 4 == 0 ? arr.length / 4 : (arr.length / 4) + 1][4];
        // 第一种方式
//        for (int i = 0; i < arr.length; i++) {
//            arr2[i / 4][i % 4] = arr[i];
//        }

        // 第二种方式伪造索引思想
        int index = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = index++;
            }
        }
        System.out.println(Arrays.deepToString(arr2));
    }
}
