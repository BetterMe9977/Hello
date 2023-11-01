package com.hspedu.exception_;

public class NumberFormatException_ {
    public static void main(String[] args) {
        String name = "1234";
        String name2 = "韩顺平教育";

        //将String 转成 int
        int num = Integer.parseInt(name);
        int num2 = Integer.parseInt(name2);//NumberFormatException
        System.out.println(num);
        System.out.println(num2);
    }
}
