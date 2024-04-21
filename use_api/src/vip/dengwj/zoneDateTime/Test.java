package vip.dengwj.zoneDateTime;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Test {
    public static void main(String[] args) {
        // ZoneDateTime 带时区的时间

        // 获取当前时间的 ZoneDateTime 对象
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now); // 2024-04-21T11:47:25.154015+08:00[Asia/Shanghai]

        // 获取指定时间的 ZoneDateTime 对象
        ZonedDateTime of = ZonedDateTime.of(2024, 4, 21, 11, 49, 5, 0, ZoneId.systemDefault());
        System.out.println(of); // 2024-04-21T11:49:05+08:00[Asia/Shanghai]
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(Instant.now(), ZoneId.of("Asia/Shanghai"));
        System.out.println(zonedDateTime); // 2024-04-21T11:50:35.709909+08:00[Asia/Shanghai]

        // 修改时间
        ZonedDateTime zonedDateTime1 = ZonedDateTime.ofInstant(Instant.ofEpochMilli(0L), ZoneId.systemDefault());
        ZonedDateTime zonedDateTime2 = zonedDateTime1.withYear(2024);
        System.out.println(zonedDateTime2); // 2024-01-01T08:00+08:00[Asia/Shanghai]
        ZonedDateTime zonedDateTime3 = zonedDateTime1.withMonth(5);
        System.out.println(zonedDateTime3); // 1970-05-01T08:00+08:00[Asia/Shanghai]

        // 减少时间
        ZonedDateTime zonedDateTime4 = zonedDateTime2.minusYears(1);
        System.out.println(zonedDateTime4); // 2023-01-01T08:00+08:00[Asia/Shanghai]

        // 增加时间
        ZonedDateTime zonedDateTime5 = zonedDateTime2.plusYears(2);
        System.out.println(zonedDateTime5); // 2026-01-01T08:00+08:00[Asia/Shanghai]

        // JDK8新增的时间对象都是不可变的
        // 如果我们修改了，减少了，增加了时间
        // 那么调用者是不会发生改变的，产生一个新的时间
    }
}
