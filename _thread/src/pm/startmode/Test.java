package pm.startmode;

public class Test {
    public static void main(String[] args) {
        /**
         * 多线程的第一种启动方式
         * 1、自己定义一个类继承 Thread
         * 2、重写 run 方法
         * 3、创建子类的对象，并启动线程
         */
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();

        mt1.setName("1");
        mt1.start();

        mt2.setName("2");
        mt2.start();
    }
}
