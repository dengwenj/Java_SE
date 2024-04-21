package dengwj.ww;

import java.util.ArrayList;
import java.util.Arrays;

public class BaseSearch {
    public static void main(String[] args) {
        // 基本查找/顺序查找
        // 查找某个元素是否在数组中存在
        int[] arr = {1, 22, 33, 44, 55, 66, 22};
        System.out.println(isExit(arr, 22)); // true
        System.out.println(isExit(arr, 88)); // false

        System.out.println(findIndex(arr, 22)); // 1
        System.out.println(findIndex(arr, 222)); // -1

        System.out.println(findIndexAll(arr, 22)); // [1, 6]
    }

    // 查找某个元素是否存在
    public static boolean isExit(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }

    // 查找某个元素的索引
    public static int findIndex(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    // 查找某个元素在数组中全部出现的索引
    public static ArrayList<Integer> findIndexAll(int[] arr, int num) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                list.add(i);
            }
        }

        return list;
    }
}
