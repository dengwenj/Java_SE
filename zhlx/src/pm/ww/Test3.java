package pm.ww;

public class Test3 {
    public static void main(String[] args) {
        // 有一堆桃子，猴子第一天吃了其中的一半，并多吃了一个
        // 以后每天猴子都吃当前剩下来的一半，然后再多吃一个
        // 第 10 天的时候（还没吃），发现只剩下一个桃子了，
        // 10: 1
        // 9: (第十天 + 1) * 2 = 4
        // 8: (第九天 + 1) * 2 = 10
        int method = method(1);
        System.out.println(method); // 1534
    }

    public static int method(int day) {
        if (day == 10) {
            return 1;
        }

        return (method(day + 1) + 1) * 2;
    }
}
