package pm.ww2;

import java.util.StringJoiner;

public class ArrayUtil {
    private ArrayUtil() {}

    // 返回整数数组的内容
    public static String printArr(int[] arr) {
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < arr.length; i++) {
            sj.add(arr[i] + "");
        }

        return sj.toString();
    }

    public static double getAerage(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
}
