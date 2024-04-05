package pu.ww;

public class Demo06 {
    public static void main(String[] args) {
        // 数字加密
        // 某系统的数字密码（大于 0），比如：1983，采用加密方式进行传输
        // 加密规则：先得到每位数，然后每位数都加上5，再对10求余，最后将所有数字反转，得到一串新数
        int num = 1983; // 6 14 13 8 -> 6 4 3 8 -> 8 3 4 6
        int newNum = 0;
        // 把整数上的每一位拆开 int ge = num % 10;
        while (num != 0) {
            // 得到个位
            int ge = num % 10;
            // 加上 5
            ge += 5;
            // 取余 10
            int n = ge % 10;
            num = num / 10; // 取整数的
            newNum = newNum * 10 + n; // 8346
        }
        System.out.println(newNum);

        // 8 3 4 6 -> 8346
        int[] arr = {8, 3, 4, 6};
        // 这样写出来有点牛的🐂！！！ number = number * 10 + arr[i]
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number * 10 + arr[i];
        }
        System.out.println(number);
    }
}
