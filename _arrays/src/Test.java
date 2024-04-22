import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 2, 6, 1, 7, 9, 8};
        int[] arr2 = {1, 2, 3, 4, 6, 9};
        Integer[] arr3 = {3, 1, 5, 7, 9, 4};

        // 把数组拼接成一个字符串
        System.out.println(Arrays.toString(arr));

        // 二分查找法查找元素
        // 细节1：二分查找的前提，数组中的元素必须是有序的，数组中的元素必须是升序的
        // 细节2：如果要查找的元素是存在的，那么返回的是真实的索引
        // 如果要查找的元素是不存在的，返回的是 -插入点 - 1
        System.out.println(Arrays.binarySearch(arr2, 3)); // 2
        System.out.println(Arrays.binarySearch(arr2, 2)); // 1
        System.out.println(Arrays.binarySearch(arr2, 20)); // -7

        // 拷贝数组

        System.out.println(Arrays.toString(Arrays.copyOf(arr, 15))); // [3, 4, 5, 2, 6, 1, 7, 9, 8, 0, 0, 0, 0, 0, 0]
        System.out.println(Arrays.toString(Arrays.copyOf(arr, arr.length))); // [3, 4, 5, 2, 6, 1, 7, 9, 8]
        System.out.println(Arrays.toString(Arrays.copyOf(arr, 2))); // [3, 4]

        // 拷贝数组（指定范围）
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 2, 5))); // [5, 2, 6]

        // 填充数组
        Arrays.fill(arr, 20);
        System.out.println(Arrays.toString(arr)); // [20, 20, 20, 20, 20, 20, 20, 20, 20]

        // 排序
        // 默认是升序
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3)); //[1, 3, 4, 5, 7, 9]
        Arrays.sort(arr3, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // o1 - o2 升序
                // o2 - o1 降序
                return o2 - o1;
            }
        });
        System.out.println(Arrays.toString(arr3)); // [9, 7, 5, 4, 3, 1]
    }
}
