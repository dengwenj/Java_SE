package pm.anli.demo1;

public class Test {
    public static void main(String[] args) {
        // 一共有 1000 张电影票，可以在两个窗口领取，假设每次领取的时间为 3000 毫秒
        // 要求：请用多线程模拟卖票过程并打印剩余电影票的数量
        // 两个窗口代表两个多线程，共用一个数据
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("窗口1");
        t2.setName("窗口2");

        t1.start();
        t2.start();
    }
}
