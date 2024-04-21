package vip.dengwj.chronoUnit;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Test {
    public static void main(String[] args) {
        // ChronoUnit 用于计算两个日期间隔
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime of = LocalDateTime.of(2000, 2, 2, 11, 11, 11);

        long between = ChronoUnit.YEARS.between(of, now);
        System.out.println(between); // 24
        long between1 = ChronoUnit.MONTHS.between(of, now);
        System.out.println(between1); // 290
    }
}
