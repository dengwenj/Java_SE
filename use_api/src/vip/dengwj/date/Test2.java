package vip.dengwj.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat(); // 默认格式
        Date d1 = new Date();
        String format1 = sdf1.format(d1);
        System.out.println(format1); // 2024/4/20 下午9:11

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E"); // 指定格式
        String format2 = sdf2.format(d1);
        System.out.println(format2); // 2024-04-20 21:13:45 周六

        // 解析, 把字符串转换成 Date 对象
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = "2024-04-01 19:00:00";
        // s 要跟创建对象的指定格式一样
        Date date = sdf3.parse(s);
        System.out.println(date.getTime()); // 1711969200000
    }
}
