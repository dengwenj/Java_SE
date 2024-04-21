public class Recursion {
    public static void main(String[] args) {
        // 递归的核心： 方法调用栈，后进先出，返回值给上一次的方法
        // 用递归求 1-100 的和
        System.out.println(getSum(100)); // 5050

        // 用递归求阶乘
        // 5! = 5 * 4 * 3 * 2 * 1
        System.out.println(jc(5)); // 120
    }

    public static int getSum(int num) {
        if (num == 1) {
            return 1;
        }
        return num + getSum(num  - 1);
    }

    public static int jc(int num) {
        if (num == 1) {
            return 1;
        }
        return num * jc(num - 1);
    }
}
