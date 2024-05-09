package pm.anli.demo06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 有一个抽奖池，该抽奖池中存放了奖励的金额，该抽奖池中的奖项为
        // {10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300, 700};
        // 创建两个抽奖箱，设置线程名称为 抽奖箱1，抽奖箱2
        // 随机从奖池中获取奖项元素并打印在控制台上
        // 直到抽完，才结束
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300, 700);

        MyCallable mc1 = new MyCallable(list);
        MyCallable mc2 = new MyCallable(list);

        FutureTask<ArrayList<Integer>> ft1 = new FutureTask<>(mc1);
        FutureTask<ArrayList<Integer>> ft2 = new FutureTask<>(mc2);

        Thread t1 = new Thread(ft1);
        Thread t2 = new Thread(ft2);

        t1.setName("抽奖箱1");
        t2.setName("抽奖箱2");

        t1.start();
        t2.start();

        ArrayList<Integer> list1 = ft1.get();
        ArrayList<Integer> list2 = ft2.get();

        String substring1 = "";
        String substring2 = "";
        int[] calc1 = {0, 0};
        int[] calc2 = {0, 0};
        if (list1.size() != 0) {
            String string = list1.toString();
            substring1 = string.substring(1, string.length() - 1);
            calc1 = calc(list1);
        }
        if (list2.size() != 0) {
            String string = list2.toString();
            substring2 = string.substring(1, string.length() - 1);
            calc2 = calc(list2);
        }

        System.out.println(t1.getName() + "共产生了" + list1.size() + "个奖项");
        System.out.println("分别是：" + substring1 + "，最高奖项为：" + calc1[0] + "元，" + "总计额为" + calc1[1] + "元");
        System.out.println("-----------------------");
        System.out.println(t2.getName() + "共产生了" + list2.size() + "个奖项");
        System.out.println("分别是：" + substring2 + "，最高奖项为：" + calc2[0] + "元，" + "总计额为" + calc2[1] + "元");
        System.out.println("--------------------------");

        int max = calc1[0];
        String man = t1.getName();
        if (calc2[0] > calc1[0]) {
            max = calc2[0];
            man = t2.getName();
        }
        System.out.println("在此次抽奖过程中，" + man + "中产生了最大奖项，该奖项金额为 " + max + " 元");
    }

    public static int[] calc(ArrayList<Integer> list) {
        int[] arr = new int[2];

        int max = list.get(0);
        int sum = 0;
        for (int val : list) {
            // 求和
            sum += val;
            // 最大值
            if (val > max) {
                max = val;
            }
        }
        arr[0] = max;
        arr[1] = sum;
        return arr;
    }
}
