package pm.method;

public class Test4 {
    public static void main(String[] args) throws InterruptedException {
        // 插入线程

        MyThread4 t = new MyThread4();
        t.setName("朴睦");
        t.start();
        // 表示把 t 这个线程，插入到当前线程之前
        t.join(); // 当前线程是main线程，即插入到main线程之前

        for (int i = 0; i < 10; i++) {
            System.out.println("main线程" + i);
        }
    }
}
