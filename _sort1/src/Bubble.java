import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        // 冒泡排序
        // 相邻的元素两两比较，大的放右边，小的放左边
        // 第一轮比较完毕之后，最大值就已经确定，第二轮可以少循环一次，后面一次类推
        // 如果数组中有 n 个数据，总共只要执行 n -1 轮的代码就行
        int[] arr = {4, 5, 1, 3, 2, 0, -1, 6};
        int[] sorts = bubbleSort(arr);
        System.out.println(Arrays.toString(sorts));
    }
    
    public static int[] bubbleSort(int[] arr) {
        // 外循环是要循环多少次
        for (int i = 0; i < arr.length - 1; i++) {
            // 内循环是执行的次数比较
            // -1：为了防止索引越界
            // -i：每一轮执行的次数比上一轮少一次
            for (int j = 0; j < arr.length - i - 1; j++) {
                int temp = arr[j];
                // 说明前面的大于后面的
                if (temp > arr[j + 1]) {
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
