## 线程
* 线程是操作系统能够进行运算调度的最小单位。它被包含在进程之中，是进程中的实际运作单位
* 简单理解：应用软件中相互独立，可以同时运行的功能
* Java 中线程是抢占式调度，即随机性

## 什么是多线程？
* 有了多线程，我们就可以让程序同时做多件事情

## 多线程的作用？
* 提高效率

## 多线程的应用场景？
* 只要想让多个事情同时运行就需要用到多线程
* 比如：软件中的耗时操作、所有的聊天软件、所有的服务器

## 多线程两个概念（并发、并行）
* 并发：在同一时刻，有多个指令在单个CPU上交替执行
* 并行：在同一时刻，有多个指令在多个CPU上同时执行
* 就是去操作线程，2核4线程(表示：如果只有四个线程用并行就好了，如果大于4个线程，就要用到并发，某些会处理多个线程)
 
## 多线程的实现方式
* 1、继承 Thread 类的方式进行实现
* 2、实现 Runnable 接口的方式进行实现
* 3、利用 Callable 接口和 Future 接口方式实现

## 继承 Thread 类的方式进行实现
* 1、自己定义一个类继承 Thread
* 2、重写 run 方法
* 3、创建子类的对象，并启动线程 t.start()

## 实现 Runnable 接口的方式进行实现
* 1、自己定义一个类实现 Runnable 接口（可以是匿名内部类，就可以用 lambda 表达式）
* 2、重写里面的 run 方法
* 3、创建自己的类的对象
* 4、创建一个 Thread 类的对象，并开启线程  new Thread(MyRun); MyRun 是一个类
```java
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
```

## 利用 Callable 接口和 Future 接口方式实现
* 1、创建一个类 MyCallable 实现 Callable 接口
* 2、重写 call（是有返回值的，表示多线程运行的结果）
* 3、创建 MyCallable 的对象（表示多线程要执行的任务）
* 4、创建 FutureTask 的对象（作用：管理多线程运行的结果）
* 5、创建 Thread 类的对象，并启动
```java
package pm.startmode;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test3 {
    private static final String name = "朴睦";

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 表示多线程要执行的任务
        MyCallable mc = new MyCallable();
        FutureTask<Integer> ft = new FutureTask<>(mc);

        new Thread(ft).start();
        System.out.println(ft.get()); // 5050
        
        // lambda表达式
        FutureTask<Integer> integerFutureTask = new FutureTask<>(() -> {
            return 1;
        });
        new Thread(integerFutureTask).start();
        Integer integer = integerFutureTask.get();
        System.out.println(integer); // 1

        // 方法引用
        FutureTask<String> stringFutureTask = new FutureTask<>(Test3::run1);
        Thread t = new Thread(stringFutureTask, "字符串");
        t.start();
        System.out.println(t.getName());
        System.out.println(stringFutureTask.get());
    }

    public static String run1() {
        return name + "24";
    }
}
```

## 多线程三种实现方式对比
* 1、继承Thread
* 优点：编程比较简单，可以直接使用 Thread 类中的方法
* 缺点：可扩展性较差，不能再继承其他的类
* 2、实现 Runnable 接口，3、实现 Callable 接口
* 优点：扩展性强，实现该接口的同时还可以继承其他的类
* 缺点：编程相对复杂，不能直接使用 Thread 类中的方法

## 常见的成员方法
* String getName(); 返回此线程的名称
* 
* void setName(); 设置线程的名字（构造方法也可以设置名字）
* 细节：
* 1、如果我们没有给线程设置名字，线程也是有默认名字的。格式：Thread-X（X 序号，从0开始）
* 2、如果我们要给线程设置名字，可以用 setName 方法进行设置，也可以构造方法设置
* 
* static Thread currentThread(); 获取当前线程的对象
* 细节：
* 当 JVM 虚拟机启动之后，会自动的启动多条线程，其中有一条线程是 main 线程，它的作用是去调用 main 方法，以前我们写的代码都是在 main 线程运行的
* 
* static void sleep(long time); 让线程休眠指定的时间，单位为毫秒
* 细节：
* 1、哪条线程执行到这个方法，那么哪条线程就会在这里停留对应的时间
* 2、方法的参数：就表示睡眠的时间，单位毫秒
* 3、当时间到了之后，线程会自动的醒来，继续执行下面的代码
* 
* setPriority(int newPriority); 设置线程的优先级，优先级不是绝对的，只是概率问题
* final int getPriority(); 获取线程的优先级
* 
* final void setDaemon(boolean on); 设置为守护线程
* 细节：当其他的非守护线程执行完毕之后，守护线程会陆续结束
* 
* public static void yield(); 出让线程/礼让线程（表示出让当前 CPU 的执行权）
* public static void join(); 插入线程/插队线程

## 线程的生命周期
* 线程在执行代码的时候，随时有可能被其他线程抢走！！！！！！！

## 同步代码块（解决线程安全问题）
* 把操作共享数据的代码锁起来
* 格式：
* synchronized (锁对象) { 操作共享数据的代码 }
* 特点1：锁默认打开，有一个线程进去了，锁自动关闭
* 特点2：里面的代码全部执行完毕，线程出来，锁自动打开
* 
* sleep不会释放锁，但是会让出cpu执行权
* java的Thread.sleep()相当于让线程睡眠，交出CPU，让CPU去执行其他的任务。 
* 但是有一点要非常注意，sleep方法不会释放锁，也就是说如果当前线程持有对某个对象的锁，
* 则即使调用sleep方法，其他和当前线程争抢的线程也无法访问这个对象，只能等待，等执行完

## 同步方法
* 就是把 synchronized 关键字加到方法上
* 格式：修饰符 synchronized 返回值类型 方法名(方法参数) {...}
* 特点1：同步方法是锁住方法里面所有的代码
* 特点2：锁对象不能自己指定，非静态是 this，静态是当前类的字节码文件对象
```java
package pm.safe;

public class MyRunnable implements Runnable {
    private int ticker = 0;

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            while (true) {
                if (syncMethod()) {
                    break;
                }
            }
        }
    }

    // 同步方法
    public synchronized boolean syncMethod() {
        if (ticker < 100) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ticker++;
            System.out.println(Thread.currentThread().getName() + "正在卖第" + ticker + "张票");
            return false;
        }
        return true;
    }
}
```

## Lock 锁
* 虽然可以理解同步代码块和同步方法的锁对象问题
* 但是并没有直接看到在哪里加上了锁，在哪里释放了锁
* 为了更清晰的表达如何加锁和释放锁，JDK5以后提供了一个新的锁对象 Lock
* Lock实现提供比使用 synchronized 方法和语句可以获得更广泛的锁定操作
* Lock 中提供了获得锁和释放锁的方法（手动上锁、手动释放锁）
* void lock(); 获得锁
* void unlock(); 释放锁
* Lock 是接口不能直接实例化，采用它的实现类 ReentrantLock 来实例化
* ReentrantLock 的构造方法
* ReentrantLock(); 创建一个 ReentrantLock 的实例
```java
package pm.safe;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyRunnable2 implements Runnable {
    // 共享
    private int ticker = 0;
    private final Lock l = new ReentrantLock();

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            while (true) {
                // 手动上锁
                l.lock();
                try {
                    if (ticker == 100) {
                        break;
                    } else {
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        ticker++;
                        System.out.println(Thread.currentThread().getName() + "正在卖第" + ticker + "张票");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    // 手动释放锁
                    l.unlock();
                }
            }
        }
    }
}
```

## 死锁
* 两个锁嵌套起来了
* 解决：不要让两个锁嵌套起来