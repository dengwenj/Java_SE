package pm.ww1;

public class Test {
    public static void main(String[] args) {
        // 可变参数
        System.out.println(getSum(1, 2, 3, 4, 5, 6, 7));
    }

    public static int getSum(int one, int... args) {
        int sum = one;
        for (int arg : args) {
            sum += arg;
        }
        return sum;
    }
}
