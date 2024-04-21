package vip.dengwj.dateTimeFormatter;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Test {
    public static void main(String[] args) {
        // DateTimeFormatter 用于时间的格式化和解析

        // 解析/格式化器
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss E a");
        ZonedDateTime now = ZonedDateTime.now();
        // 格式化 format(时间对象)
        String format = dateTimeFormatter.format(now);
        System.out.println(format); // 2024-04-21 12:00:17 周日 下午
    }
}
