package pm.ww13;

import java.util.Arrays;
import java.util.Random;

public class Demo05 {
    public static void main(String[] args) {
        // 已知数组元素为 {33, 5, 22, 44, 55}, 求出元素最大值
        int[] arr = {33, 5, 22, 44, 55};
        // max 的初始值一定要是数字中的值
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);

        // 遍历数组求和
        int[] arr2 = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr2.length; i++) {
            int num = r.nextInt(100) + 1;
            arr2[i] = num;
        }

        int sum = arr2[0];
        int count = 0;
        for (int i = 1; i < arr2.length; i++) {
            sum += arr2[i];
        }
        double p = (double) sum / arr2.length;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < p) {
                count++;
            }
        }
        System.out.println("总数：" + sum);
        System.out.println("平均数：" + p);
        System.out.println("比平均数小的：" + count);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        System.out.println("-------------------------");
        // 交换数据 {1, 2, 3, 4, 5} -> {5, 4, 3, 2, 1}
        int[] arr3 = {3, 55, 2, 4, 5};
//        int[] arr4 = new int[arr3.length];
//        for (int i = arr3.length - 1; i >= 0; i--) {
//            System.out.println(arr3[i]);
//            arr4[arr3.length - 1 - i] = arr3[i];
//        }
//        for (int i = 0; i < arr4.length; i++) {
//            // System.out.print(arr4[i] + " ");
//        }

        // 冒泡排序
        for (int i = 1; i < arr3.length; i++) {
            // 每次放到最后
            //控制每一轮的次数
            for (int j = 0; j <= arr3.length - 1 - i; j++) {
                if (arr3[j] > arr3[j + 1]) {
                    int temp = arr3[j];
                    arr3[j] = arr3[j + 1];
                    arr3[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr3));

        // 打乱数组中的数据
        int[] arr5 = {1, 2, 3, 4, 5};
        Random r1 = new Random();
        for (int i = 0; i < arr5.length; i++) {
            int num = r1.nextInt(arr5.length);
            // 交换可以用到临时变量技点
            int temp = arr5[i];
            arr5[i] = arr5[num];
            arr5[num] = temp;
        }
        System.out.println(Arrays.toString(arr5));

        int[] arr6 = {1, 2, 3};
        int[] arr7 = arr6;
        arr6[0] = 100;
        System.out.println(Arrays.toString(arr6));
        System.out.println(Arrays.toString(arr7));
    }
}
