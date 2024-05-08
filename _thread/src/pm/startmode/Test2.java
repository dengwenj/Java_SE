package pm.startmode;

public class Test2 {
    public static void main(String[] args) {
        // 创建 MyRun 的对象
        // 表示多线程要执行的任务
        MyRun mr = new MyRun();

        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);

        t1.setName("1");
        t1.start();

        t2.setName("2");
        t2.start();

        // 匿名内部类方式
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "多线程");
            }
        }, "3").start();


        // 方法引用方式
        new Thread(Test2::run1, "4").start();
    }

    public static void run1() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "多线程");
        }
    }
}
