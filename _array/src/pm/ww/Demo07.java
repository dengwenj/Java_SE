package pm.ww;

public class Demo07 {
    public static void main(String[] args) {
        int[][] arr = {
            {22, 66, 44},
            {77, 33, 88},
            {25, 45, 65},
            {11, 66, 99}
        };

        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr[i].length; j++) {
                count += arr[i][j];
            }
            n += count;
            System.out.println("每个季度的营业额：" + count);
        }
        System.out.println("总营业额：" + n);
    }
}
