package pu.ww;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Demo09 {
    public static void main(String[] args) {
        // 抽奖，分别是 {2, 588, 888, 1000, 10000}
        // 使用代码模拟抽奖，打印出每个奖项， 奖项的出现顺序要随机且不重复
        int[] arr = {2, 588, 888, 1000, 10000};

        // 定义新数组用于存储抽奖的结果
        int[] newArr = new int[arr.length];

        Random r = new Random();

        for (int i = 0; i < arr.length;) {
            int idx = r.nextInt(arr.length);

            boolean flag = false;
            for (int j = 0; j < newArr.length; j++) {
                // 说明存在
                if (arr[idx] == newArr[j]) {
                    flag = true;
                    break;
                }
            }

            // 说明不存在
            if (!flag) {
               newArr[i] = arr[idx];
               i++;
            }
        }
        System.out.println(Arrays.toString(newArr));


        // 打乱顺序
        for (int i = 0; i < arr.length; i++) {
            int idx = r.nextInt(arr.length);
            // 拿着 i 跟随机索引 idx 上的值进行交换
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
