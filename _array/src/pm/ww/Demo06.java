package pm.ww;

public class Demo06 {
    public static void main(String[] args) {
        // 二维数组：当我们需要把数据分组管理的时候，就需要用到二维数组
        int[][] arr = new int[][]{
            {1, 2, 3, 4},
            {5, 6, 7, 8}
        };

        int[][] arr1 = {
            {1, 2},
            {3, 4}
        };

        // 元素访问：数组名[索引][索引]
        System.out.println(arr[0][0]);

        // 二维数组遍历
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // 动态初始化
        int[][] newArr = new int[2][3];

        newArr[0][0] = 1000;
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[i].length; j++) {
                System.out.print(newArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
