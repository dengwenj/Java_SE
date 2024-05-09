package pm.anli.demo2;

public class Test {
    private static int num = 100;

    // 锁对象
    private static final Object lock = new Object();

    public static void main(String[] args) {
        // 有 100 份礼品，两人同时发送，当剩下的礼品小于 10份的时候则不再送出
        // 利用多线程模拟该过程并将线程的名字和礼物的剩余数量打印出来

        // 来利用 lambda + 方法引用做下
        Thread t1 = new Thread(Test::run, "第一人");
        Thread t2 = new Thread(Test::run, "第二人");

        t1.start();
        t2.start();
    }

    public static void run() {
        while (true) {
            synchronized (lock) { // 锁上
                if (num < 10) {
                    break;
                } else {
                    num--;
                    System.out.println(Thread.currentThread().getName() + " -> " + "剩余" + num + "件礼物");
                }
            } // 同步代码块执行完，释放锁
        }
    }
}
