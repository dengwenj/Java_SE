package pm.anli.demo3;

public class Test {
    public static void main(String[] args) {
        // 同时开启两个线程，共同获取 1-100 之间的所有数字
        // 要求：将输出所有的奇数
        MyRunnable mr = new MyRunnable();
        Thread t1 = new Thread(mr, "朴睦");
        Thread t2 = new Thread(mr, "李雷");
        t1.start();
        t2.start();
    }
}
