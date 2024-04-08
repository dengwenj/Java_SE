package pm.ww1;

public class Demo07 {
    public static void main(String[] args) {
        // 拼接字符串
        // 定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，并在控制台输出结果

         int[] arr = {1, 2, 3};
         System.out.println(arrToString(arr));
    }

    public static String arrToString(int[] arr) {
        if (arr == null) {
            return "";
        }

        if (arr.length == 0) {
            return "[]";
        }

        String res = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                res += arr[i] + ", ";
            } else {
                res += arr[i] + "]";
            }

        }

        return res;
    }
}
