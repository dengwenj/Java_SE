package vip.dengwj.runtime;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        // getRuntime 静态方法：当前系统的运行环境
        Runtime r = Runtime.getRuntime();

        // exit 停止虚拟机
        //r.exit(0);
        //System.out.println("后面运行了吗");

        // 获取 CPU 的线程数
        System.out.println(r.availableProcessors()); // 8

        // JVM 能从系统中获取总内存打下，单位 byte
        System.out.println(r.maxMemory() / 1024 / 1024); // 4096 M

        // JVM 已经从系统中获取总内存大小，单位 byte
        System.out.println(r.totalMemory() / 1024 / 1024); // 260 M

        // JVM 剩余内存大小
        System.out.println(r.freeMemory() / 1024 / 1024); // 255 M

        // 运行 cmd
        r.exec("notepad");
    }
}
