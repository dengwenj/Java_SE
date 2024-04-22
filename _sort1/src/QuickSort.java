import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        // 快速排序
        // 第一轮：把 0 索引的数字作为基准数，确定基准数在数组中正确的位置
        // 比基准数小的全部在左边，比基准数大的全部在右边
        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        quickSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int[] arr, int i, int j) {
        int start = i;
        int end = j;

        if (start > end) {
            return;
        }

        // 基准数
        int baseNumber = arr[i];

        while (start != end) {
            // 利用 end，从后往前开始找，找比基准数小的数字
            while (true) {
                if (end <= start || arr[end] < baseNumber) {
                    break;
                }
                end--;
            }
            // 利用 start，从前往后找，找比基准数大的数字
            while (true) {
                if (end <= start || arr[start] > baseNumber) {
                    break;
                }
                start++;
            }

            // 交换位置
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        // 说明 start 和 end 一样了
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;

        quickSort(arr, i, end - 1);
        quickSort(arr, start  + 1, j);
    }
}
