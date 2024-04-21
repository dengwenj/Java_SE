import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        // 插入排序
        // 将 0 索引的元素到 n 索引的元素看做是有序的，把 n + 1 索引的元素到最后一个当成是无序的
        // 遍历无序的数据，将遍历到的元素插入有序序列中适当的位置，如遇到相同数据，插在后面
        // n 的范围：0~最大索引
        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        int[] ints = insertSort(arr);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] insertSort(int[] arr) {
        // 遍历无序的
        for (int i = 1; i < arr.length; i++) {
            // 有序的
            for (int j = 0; j < i; j++) {
                // 比较
                // 有序的大于无序的
                if (arr[j] > arr[i]) { 
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        return arr;
    }
}
