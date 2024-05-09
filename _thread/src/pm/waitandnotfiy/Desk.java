package pm.waitandnotfiy;

// 作用：控制生产者和消费者的执行
public class Desk {
    // 0 代表没有面条，1代表有面条
    public static int foodFlag = 0;

    //总共要吃多少
    public static int count = 10;

    // 锁对象
    public static final Object obj = new Object();
}
