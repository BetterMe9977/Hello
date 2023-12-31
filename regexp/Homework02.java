package com.hspedu.regexp;

public class Homework02 {
    public static void main(String[] args) {

        //要求验证是不是整数或小数
        //要考虑正数和负数
        //如： 123,  -345,  34.89,  -89.7,  -0.01, 0.45

        //1. 先写出简单的正则表达式
        //2. 再逐步完善【根据各种情况来完善】

        String content = "-0.89";
        String regStr = "^[-+]?([1-9]\\d*|0)(\\.\\d+)?$";

        if (content.matches(regStr)) {
            System.out.println("匹配成功 是整数或小数");
        } else {
            System.out.println("匹配失败");
        }
    }
}
