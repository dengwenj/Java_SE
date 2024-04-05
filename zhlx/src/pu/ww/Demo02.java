package pu.ww;

public class Demo02 {
    public static void main(String[] args) {
        // 判断 101 - 200 之间有多少个质数，并输出所有质数
        // 只能被 1 和 本身整除的数，就是质数，除以其他数不是整数
        int count = 0;
        for (int i = 101; i <= 200; i++) {
            boolean flag = true;
            for (int j = 2; j <= i - 1; j++) {
                // 说明除尽了，是整数，不是质数
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
                System.out.println("质数：" + i);
            }
        }
        System.out.println("一共" + count + "个质数");
    }
}
