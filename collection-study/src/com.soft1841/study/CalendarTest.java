package com.soft1841.study;

import java.util.Calendar;
import java.util.Date;
/**
 * Created by 田震 on 2019/3/22 6:34
 */
public class CalendarTest {
    public static void main (String[] args) {
        Calendar c=Calendar.getInstance();
        int year=c.get(Calendar.YEAR);
        int month=c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);
        //获取小时
        int hour = c.get(Calendar.HOUR_OF_DAY);
        //获取分钟
        int minute = c.get(Calendar.MINUTE);
        //获取秒
        int second = c.get(Calendar.SECOND);
        System.out.println("当前时间：" + year + "-" + month + "-" + day + " "
                + hour + ":" + minute + ":" + second );
        //将Calendar对象转换成Date对象
        Date date = c.getTime();
        //获取当前毫秒
        Long time = c.getTimeInMillis();
        System.out.println("当前时间：" + date);
        System.out.println("当前毫秒：" + time);
    }
}
