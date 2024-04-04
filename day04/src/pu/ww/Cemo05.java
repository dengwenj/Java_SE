package pu.ww;

public class Cemo05 {
    public static void main(String[] args) {
        // 无限循环 和 跳转控制循环
        // while (true) {} 无限循环
        // for (;;) {} 无限循环
        // do {} while(true) 无限循环

        // 跳转控制循环
        for (int i = 0; i < 5; i++) {
            // continue: 跳过本次循环，继续执行下次循环
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            if (i == 3) {
                // break: 结束整个循环
                break;
            }
        }
    }
}
