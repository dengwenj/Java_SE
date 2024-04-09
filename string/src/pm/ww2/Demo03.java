package pm.ww2;

public class Demo03 {
    public static void main(String[] args) {
        // 拼接字符串
        // 定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回
        // int[] arr = {1, 2, 3}; -> [1, 2, 3]
        int[] arr = {1, 2, 3};
        System.out.println(arrToString(arr));
    }

    public static String arrToString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i == arr.length - 1) {
                sb.append("]");
            } else {
                sb.append(", ");
            }
        }

        return sb.toString();
    }
}
