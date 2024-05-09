package pm.putandtake;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodie extends Thread{
    private final ArrayBlockingQueue<String> queue;

    public Foodie(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                queue.put("面条");
                System.out.println("厨师");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
