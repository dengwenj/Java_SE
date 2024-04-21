package vip.dengwj.zoneId;

import java.time.ZoneId;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        // ZoneId 时区

        // 获取 java 中支持的所有时区
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(availableZoneIds);
        System.out.println(availableZoneIds.size()); // 603

        // 获取系统默认时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId); // Asia/Shanghai

        // 获取一个指定时区
        ZoneId of = ZoneId.of("Asia/Macau");
        System.out.println(of); // Asia/Macau
    }
}
