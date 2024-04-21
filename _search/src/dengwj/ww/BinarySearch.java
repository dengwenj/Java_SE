package dengwj.ww;

public class BinarySearch {
    public static void main(String[] args) {
        // 二分查找/折半查找，提高查找的效率
        // 前提条件：数组中的数据必须是有序的
        // 核心逻辑：每次排除一半的查找范围

        int[] arr = {7, 10, 20, 40, 55, 77, 88, 99};
        int index = binarySearch(arr, 100);
        System.out.println(index);
    }

    public static int binarySearch(int[] arr, int num) {
        // 初始化
        int min = 0;
        int max = arr.length - 1;

        while (true) {
            // min 和 max 表示当前要查找的范围
            // mid 是在 min 和 max 中间的
            // 如果要查找的元素在 mid 的左边，缩小范围时，min 不变，max 等于 mid 减 1
            // 如果要查找的元素在 mid 的右边，缩小范围时，max 不变，min 等于 mid 加 1

            //  越界了说明没找到
            if (min > max) {
                return -1;
            }

            // mid 是索引
            int mid = (min + max) / 2;
            // 说明 num 在左边
            if (arr[mid] > num) {
                max = mid - 1;
            } else if (arr[mid] < num) {
                // 说明在右边
                min = mid + 1;
            } else {
                // 说明找到了
                return mid;
            }
        }
    }
}
