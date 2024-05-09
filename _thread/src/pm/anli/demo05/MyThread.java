package pm.anli.demo05;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {
    private static final Lock l = new ReentrantLock();

    private static final Random r = new Random();

    private final ArrayList<Integer> list;

    public MyThread(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            try {
                l.lock();
                if (list.size() == 0) {
                    break;
                } else {
                    int index = r.nextInt(list.size());
                    int val = list.get(index);
                    list.remove(index);

                    System.out.println(getName() + "抽到了" + val + "元");
                }
            } finally {
                l.unlock();
            }
        }
    }
}
