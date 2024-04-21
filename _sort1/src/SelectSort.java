import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        // 选择排序
        // 从 0 索引开始，拿着每一个索引上的元素跟后面的元素一次比较，小的放前面，大的放后面，以此类推
        int[] arr = {4, 5, 1, 3, 2, 0, -1, 6};
        int[] ints = selectSort(arr);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] selectSort(int[] arr) {
        // 外循环是多少轮
        for (int i = 0; i < arr.length - 1; i++) {
            // 内循环是比较，把循环的第一个和后面的比较
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[i] > arr[j + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }
}
