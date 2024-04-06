package pu.ww;

import java.util.Arrays;

public class Demo07 {
    public static void main(String[] args) {
        // 把数字隔开放入数组中
        int num = 12345; // -> 1 2 3 4 5
        // 先看长度有多少
        int length = 0;
        int temp = num;
        while (num != 0) {
            // 得到整数, 依次变小  1234 123 12 1 0
            num = num / 10;
            length++;
        }

        // 动态创建数组, 得到隔开的每一个数
        int[] arr = new int[length];
        // 伪造索引思想
        int index = length - 1;
        while (temp != 0) {
            int ge = temp % 10;
            temp = temp / 10;
            arr[index--] = ge;
        }
        System.out.println(Arrays.toString(arr));
    }
}
