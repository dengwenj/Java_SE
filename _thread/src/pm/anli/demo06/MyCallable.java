package pm.anli.demo06;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyCallable implements Callable<ArrayList<Integer>> {
    private static final Lock l = new ReentrantLock();

    private static final Random r = new Random();

    // 共享的
    private final ArrayList<Integer> list;

    // 他们单独的
    private final ArrayList<Integer> otherList = new ArrayList<>();

    public MyCallable(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public ArrayList<Integer> call() throws Exception {
        while (true) {
            try {
                l.lock();
                if (list.size() == 0) {
                    break;
                } else {
                    int index = r.nextInt(list.size());
                    int val = list.get(index);
                    otherList.add(val);
                    list.remove(index);
                }
            } finally {
                l.unlock();
            }
            Thread.sleep(100);
        }
        return otherList;
    }
}