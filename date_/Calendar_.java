package com.hspedu.date_;

import java.util.Calendar;

public class Calendar_ {
    public static void main(String[] args) {
        //1. Calendar 是一个抽象类， 并且构造器是protect
        //2. 可以通过 getInstance() 来获取实例
        //3. 提供大量的方法和字段
        //4.Calendar 没有提供对应格式化的类，需要自己组合输出,灵活
        //5. 时间默认12时，如果需要按照24小时进制来获取时间， Calendar.Hour => Calendar.Hour_OF_DAY
        Calendar c = Calendar.getInstance();
        System.out.println("c=" + c );
        //2.获取日历对象的某个日历字段
        System.out.println("年" + c.get(Calendar.YEAR));
        //get(Calendar.MONTH) + 1  ，返回Calendar 时候， 按照0开始编号
        System.out.println("月" + (c.get(Calendar.MONTH) + 1));
        System.out.println("日" + c.get(Calendar.DAY_OF_MONTH));
        System.out.println("时" + c.get(Calendar.HOUR));
        System.out.println("分" + c.get(Calendar.MINUTE));
        System.out.println("秒" + c.get(Calendar.SECOND));

        //Calendar 没有提供对应格式化方法，需要自己组合输出
        System.out.println(c.get(Calendar.YEAR) + "年" + (c.get(Calendar.MONTH) + 1) + "月"
                + c.get(Calendar.DAY_OF_MONTH) + "日 " + c.get(Calendar.HOUR_OF_DAY) + "时"
                + c.get(Calendar.MINUTE) + "分" + c.get(Calendar.SECOND) + "秒");

    }
}
