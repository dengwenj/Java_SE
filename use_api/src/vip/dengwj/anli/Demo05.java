package vip.dengwj.anli;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class Demo05 {
    public static void main(String[] args) throws ParseException {
        // 判断任意的一年年份是闰年还是平年
        // 2月有 29天是闰年
        // 一年有366天是闰年
        Calendar calendar = Calendar.getInstance();
        calendar.set(2000, 2, 1);
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

        LocalDate localDate = LocalDate.of(2000, 3, 1);
        LocalDate localDate1 = localDate.minusDays(1);
        int dayOfMonth = localDate1.getDayOfMonth();
        System.out.println(dayOfMonth);

        boolean leapYear = localDate.isLeapYear();
        System.out.println(leapYear);
    }
}
