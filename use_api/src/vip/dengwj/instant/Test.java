package vip.dengwj.instant;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Test {
    public static void main(String[] args) {
        // Instant  按照标准时间

        // 获取当前时间的 Instant 对象(标准时间)
        Instant now = Instant.now();
        System.out.println(now); // 2024-04-21T03:31:21.455521Z

        // 根据（秒/毫秒/纳秒）获取 Instant 对象
        Instant instant = Instant.ofEpochMilli(1000);
        System.out.println(instant); // 1970-01-01T00:00:01Z
        Instant instant1 = Instant.ofEpochSecond(3);
        System.out.println(instant1); // 1970-01-01T00:00:03Z
        Instant instant2 = Instant.ofEpochSecond(1, 1000000000);
        System.out.println(instant2); // 1970-01-01T00:00:02Z

        // 指定时区
        ZonedDateTime zonedDateTime = now.atZone(ZoneId.systemDefault());
        System.out.println(zonedDateTime); // 2024-04-21T11:35:40.221447+08:00[Asia/Shanghai]

        // 判断
        Instant instant3 = Instant.ofEpochMilli(0L);
        Instant instant4 = Instant.ofEpochMilli(1000L);
        // instant3 时间在不在 instant4 时间的后面
        boolean after = instant3.isAfter(instant4);
        System.out.println(after); // false
        // instant3 时间在不在 instant4 时间的前面
        boolean before = instant3.isBefore(instant4);
        System.out.println(before); // true

        // 减少时间
        Instant instant5 = Instant.ofEpochMilli(3000L);
        Instant instant6 = instant5.minusMillis(1000L);
        System.out.println(instant6); // 1970-01-01T00:00:02Z

        // 增加时间
        Instant instant7 = instant5.plusMillis(1000L);
        System.out.println(instant7); // 1970-01-01T00:00:04Z
    }
}
