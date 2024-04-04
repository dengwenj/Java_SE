package pm.ww;

import java.util.Arrays;

public class Demo01 {
    public static void main(String[] args) {
        // 完整写法
        int[] arr4 = new int[]{100, 200, 300};
        // 简写
        int[] arr1 = {1, 2, 3, 4};
        double[] arr2 = {1.1, 1.2, 1.3};
        String[] arr3 = {"朴睦", "王阳明"};

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }
}
