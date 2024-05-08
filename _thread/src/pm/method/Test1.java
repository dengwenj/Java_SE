package pm.method;

public class Test1 {
    public static void main(String[] args) {
        MyRun mr = new MyRun();

        Thread t1 = new Thread(mr, "朴睦");
        Thread t2 = new Thread(mr, "李雷");

        t1.start();
        t2.start();
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        // 设置线程优先级，只是概率问题
        t1.setPriority(10);
        t2.setPriority(1);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
    }
}
