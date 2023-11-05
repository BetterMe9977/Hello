package com.hspedu.date_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date01 {
    public static void main(String[] args) throws ParseException {

        //1. 获取当前系统时间
        //2. 这里的Date 类是在 java.util 包
        //3.　默认输出的日期格式 是国际方式
        //4.
        Date d1 = new Date(); //获取当前系统时间
        System.out.println("当前日期=" + d1);
        Date d2 = new Date(9234567); // 通过指定毫秒数得到时间
        System.out.println("d2=" + d2); //获得某个时间对应的毫秒数

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        String format = sdf.format(d1);
        System.out.println("当前日期=" + format);

        //1.可以把一个格式化的String 转换成对应的Date
        //2.得到Date 仍然在输出时，还是按照国际形式，如果希望指定格式输出，需要转换
        //3.在把一个String转化正Date时候，使用的sdf格式需要和给出的String格式一样，否则抛出转换异常
        String s = "1996年01月01日 10:20:30 星期一";
        Date parse = sdf.parse(s);
        System.out.println("parse=" + parse);
        System.out.println("parse=" + sdf.format(parse));


    }
}
