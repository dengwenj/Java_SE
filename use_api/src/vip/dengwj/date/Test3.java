package vip.dengwj.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test3 {
    public static void main(String[] args) throws ParseException {
        // 按照指定格式展示
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        // 先字符串转换为 Date 对象
        Date date = sdf1.parse("2000-11-11");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
        String format = sdf2.format(date);
        System.out.println(format);

        // 秒杀活动
        // 开始时间 2023年11月11日 00:00:00
        // 结束时间 2023年11月11日 00:10:00
        // 下单时间 2023年11月11日 00:01:00
        // 下单时间 2023年11月11日 00:11:00
        // 下单时间有没有参加上秒杀活动
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String startTime = "2023年11月11日 00:00:00";
        String endTime = "2023年11月11日 00:10:00";
        Date d1 = sdf3.parse(startTime);
        Date d2 = sdf3.parse(endTime);
        long diff = d2.getTime() - d1.getTime();

        String xd1 = "2023年11月11日 00:01:00";
        String xd2 = "2023年11月11日 00:11:00";
        Date d3 = sdf3.parse(xd1);
        Date d4 = sdf3.parse(xd2);

        if (d3.getTime() - d1.getTime() <= diff) {
            System.out.println("成功1");
        } else {
            System.out.println("失败1");
        }

        if (d4.getTime() - d1.getTime() <= diff) {
            System.out.println("成功2");
        } else {
            System.out.println("失败2");
        }
    }
}
