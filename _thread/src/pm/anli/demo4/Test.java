package pm.anli.demo4;

public class Test {
    public static void main(String[] args) {
        // 抢红包
        // 假设：100块，分成了3个包，现在有5个人去抢
        // 其中，红包是共享数据，5个人是5条多线程
        // 打印结果
        // xxx 抢到了 xx 元
        // xxx 抢到了 xx 元
        // xxx 抢到了 xx 元
        // xxx 没抢到
        // xxx 没抢到

//        MyThread t1 = new MyThread();
//        MyThread t2 = new MyThread();
//        MyThread t3 = new MyThread();
//        MyThread t4 = new MyThread();
//        MyThread t5 = new MyThread();

        MyThread2 t1 = new MyThread2();
        MyThread2 t2 = new MyThread2();
        MyThread2 t3 = new MyThread2();
        MyThread2 t4 = new MyThread2();
        MyThread2 t5 = new MyThread2();

        t1.setName("朴睦");
        t2.setName("李雷");
        t3.setName("王小波");
        t4.setName("李银河");
        t5.setName("王阳明");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
