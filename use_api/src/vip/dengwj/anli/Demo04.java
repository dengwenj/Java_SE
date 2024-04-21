package vip.dengwj.anli;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Demo04 {
    public static void main(String[] args) throws ParseException {
        // 实现计算活了多少天
        Date date = new Date();
        long time = date.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        // 出生日期
        Date parse = simpleDateFormat.parse("2000-01-01");
        long diff = time - parse.getTime();
        long day = diff / 1000 / 60 / 60 / 24;
        System.out.println(day);

        // 第二种方式
        ZonedDateTime now = ZonedDateTime.now();
        LocalDateTime localDateTime = LocalDateTime.of(2000, 1, 1, 1, 1,1);
        long between = ChronoUnit.DAYS.between(localDateTime, now);
        System.out.println(between);
    }
}
