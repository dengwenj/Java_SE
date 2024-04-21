## 二分查找的优势？
* 提高查找效率

## 二分查找的前提条件
* 数据必须是有序的
* 如果数据是乱序的，先排序再用二分查找得到的索引没有实际意义，只能确定当前数字在数组中是否存在，因为排序之后数字的位置就可能发生变化了

## 二分查找的过程
* min 和 max 表示当前要查找的范围
* mid 是在 min 和 max 中间的
* 如果要查找的元素在 mid 的左边，缩小范围时，min 不变，max 等于 mid 减 1
* 如果要查找的元素在 mid 的右边，缩小范围时，max 不变，min 等于 mid 加 1

## 二分查找、插值查找、斐波那契额查询各自的特点
* 相同点：都是通过不断的缩小范围来查找对应的数据的，数据都要有顺序
* 不同点：计算 mid 的方式不一样
* 二分查找：mid每次都是指向范围的中间位置
* 插值查找：mid 尽可能的靠经要查找的数据，但是要求数据尽可能的分布均匀
* 斐波那契额查找：根据黄金分割点来计算 mid 指向的位置

## 分块查找
* 分块原则1：前一块中的最大数据，小于后一块中所有的数据块内无序，块间有序）
* 分块原则2：块数数量一般等于数字的个数开根号。比如：16个数一般分为4块左右
* 核心思路：先确定要查找的元素在哪一块，然后在块内挨个查找

## 冒泡排序
* 相邻的元素两两比较，大的放右边，小的放左边
* 第一轮比较完毕之后，最大值就已经确定，第二轮可以少循环一次，后面一次类推
* 如果数组中有 n 个数据，总共只要执行 n -1 轮的代码就行
```java
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
```

## 选择排序
* 从 0 索引开始，拿着每一个索引上的元素跟后面的元素一次比较，小的放前面，大的放后面，以此类推
```java
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
```
 ## 插入排序
* 将 0 索引的元素到 n 索引的元素看做是有序的，把 n + 1 索引的元素到最后一个当成是无序的
* 遍历无序的数据，将遍历到的元素插入有序序列中适当的位置，如遇到相同数据，插在后面
* n 的范围：0~最大索引