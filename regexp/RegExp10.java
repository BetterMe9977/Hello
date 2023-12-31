package com.hspedu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp10 {
    public static void main(String[] args) {

        String content1 = "韩顺平教育";
        String content2 = "123890";
        String content3 = "123890999";
        String content = "13588889999";
        // 汉字
        String regStr1 = "^[\u0391-\uffe5]+$";

        //邮政编码
        //1-9 开头的一个6位数 比如：123890
        String regStr2 = "^[1-9]\\d{5}$";

        //QQ 号码
        //1-9 开头的一个 5-10 位数 比如：12389，123456， 12445667，1234567890
        String regStr3 = "^[1-9]\\d{4,9}$";

        //手机 号码
        //以 13， 14，15，18开头的一个 11 位数 比如：13588889999
        String regStr = "^1[3|4|5|8]\\d{9}$";

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);

        if (matcher.find()) {
            System.out.println("满足格式");
        } else {
            System.out.println("不满足格式");
        }
    }
}
