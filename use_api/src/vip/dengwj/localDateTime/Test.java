package vip.dengwj.localDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Test {
    public static void main(String[] args) {
        // LocalDate LocalTime LocalDateTime
        LocalDate now = LocalDate.now();
        System.out.println(now); // 2024-04-21
        LocalDate of = LocalDate.of(2024, 10, 1);
        System.out.println(of); // 2024-10-01
        Month month = of.getMonth();
        System.out.println(month.getValue()); // 10

        LocalTime now1 = LocalTime.now();
        System.out.println(now1); // 14:53:40.340388
        int hour = now1.getHour();
        System.out.println(hour); // 14

        LocalDateTime now2 = LocalDateTime.now();
        System.out.println(now2); // 2024-04-21T14:55:40.636906
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = dateTimeFormatter.format(now2);
        System.out.println(format); // 2024-04-21 14:55:40
        int monthValue = now2.getMonthValue();
        System.out.println(monthValue); // 4
    }
}
