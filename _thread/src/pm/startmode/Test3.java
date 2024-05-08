package pm.startmode;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test3 {
    private static final String name = "朴睦";

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 表示多线程要执行的任务
        MyCallable mc = new MyCallable();
        FutureTask<Integer> ft = new FutureTask<>(mc);

        new Thread(ft).start();
        System.out.println(ft.get()); // 5050

        // lambda表达式
        FutureTask<Integer> integerFutureTask = new FutureTask<>(() -> {
            return 1;
        });
        new Thread(integerFutureTask).start();
        Integer integer = integerFutureTask.get();
        System.out.println(integer); // 1

        // 方法引用
        FutureTask<String> stringFutureTask = new FutureTask<>(Test3::run1);
        Thread t = new Thread(stringFutureTask, "字符串");
        t.start();
        System.out.println(t.getName());
        System.out.println(stringFutureTask.get());
    }

    public static String run1() {
        return name + "24";
    }
}
