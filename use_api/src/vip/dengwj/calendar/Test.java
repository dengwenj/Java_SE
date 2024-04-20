package vip.dengwj.calendar;

import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime()); // Sat Apr 20 22:12:15 CST 2024
        System.out.println(c.getTimeInMillis()); // 1713622434131

        Date d = new Date(0L);
        c.setTime(d);
        System.out.println(c.getTime()); // Thu Jan 01 08:00:00 CST 1970

        System.out.println(c.get(Calendar.YEAR)); // 1970
        System.out.println(c.get(Calendar.WEEK_OF_YEAR)); // 1
        c.set(Calendar.YEAR, 2024);
        System.out.println(c.get(Calendar.YEAR)); // 2024
        c.add(Calendar.YEAR, 2);
        System.out.println(c.get(Calendar.YEAR)); // 2026
    }
}
