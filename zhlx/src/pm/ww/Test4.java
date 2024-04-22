package pm.ww;

public class Test4 {
    public static void main(String[] args) {
        // 爬楼梯
        // 有时一次爬一个台阶，有时一次爬两个台阶
        // 有20个台阶，一共多少种爬法
        System.out.println(method(20)); // 10946
    }

    public static int method(int num) {
        if (num == 1) {
            return 1;
        }

        if (num == 2) {
            return 2;
        }

        return method(num - 1) + method(num - 2);
    }
}
