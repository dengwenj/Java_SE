package pm.ww;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Integer[] arr = {1, 4, 5, 2, 7};

        Arrays.sort(arr, Test::sub);
        System.out.println(Arrays.toString(arr)); // [7, 5, 4, 2, 1]
    }

    public static int sub(int o1, int o2) {
        return o2 - o1;
    }
}
