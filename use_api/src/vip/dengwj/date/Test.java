package vip.dengwj.date;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        // Date 时间
        Date date = new Date(); // 获取系统的当前时间
        System.out.println(date);

        Date date1 = new Date(1000);
        System.out.println(date1); // Thu Jan 01 08:00:01 CST 1970 获取指定时间

        System.out.println(date.getTime()); // 获取毫秒值
        date.setTime(0 + 1000L * 60 * 60 * 24 * 365); // 毫秒值 修改时间
        System.out.println(date); // Fri Jan 01 08:00:00 CST 1971
    }
}
