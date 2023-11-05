package com.hspedu.date_;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class LocalDate_ {
    public static void main(String[] args) {
        //第三代日期
        //1.使用now() 返回表示当前日期时间的对象
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        //2. 使用DateTimeFormatter 对象来进行格式化
        // 创建DateTimeFormatter 对象
        DateTimeFormatter dtf  = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒 ");
        String format = dtf.format(ldt);
        System.out.println("格式化的日期=" + format);


        System.out.println("年" + ldt.getYear());
        System.out.println("月" + ldt.getMonth());
        System.out.println("月" + ldt.getMonthValue());
        System.out.println("日" + ldt.getDayOfMonth());
        System.out.println("时" + ldt.getHour());
        System.out.println("分" + ldt.getMinute());
        System.out.println("秒" + ldt.getSecond());

        LocalDate now = LocalDate.now(); // 可以获取年月日
        LocalTime now2 = LocalTime.now(); // 可以获取时分秒

        //提供plus 和minus 方法 可以对当前的时间进行加减
        //890天后是什么时候
        LocalDateTime localDateTime = ldt.plusDays(890);
        System.out.println("890天后是" + dtf.format(localDateTime) );

        //3456分钟前
        LocalDateTime minus = ldt.minusMinutes(3456);
        System.out.println("3456分钟前是" + dtf.format(minus));

    }
}
