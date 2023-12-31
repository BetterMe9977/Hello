package com.hspedu.regexp;

import java.util.regex.Pattern;

public class StringReg {
    public static void main(String[] args) {

        String content = "2000年5月，JDK1.3、JDK1.4和J2SE1.3相继发布，几周后其获得了" +
                "Apple公司Mac OS X的工业标准的支持。2001年9月24日，J2EE1.3发布。2002年" +
                "2月26日，J2SE1.4发布。自此Java的计算能力有了大幅提升";

        //使用正则表达式方式，将JDK1.3、JDK1.4 替换成JDK
        content = content.replaceAll("JDK1\\.3|JDK1\\.4","JDK");
        System.out.println("content=" + content);

        //要求验证一个手机号，必须是138  139 开头的
        content = "13688889999";
        if(content.matches("13(8|9)\\d{8}")) {
            System.out.println("验证成功");
        } else {
            System.out.println("验证失败");
        }

        //要求按照 # 或者 - 或者～ 或者数字 来分割
        System.out.println("===========================");
        content = "hello#abc-jack12smith~北京";
        String[] split = content.split("#|-|~|\\d+");
        for (String s : split) {
            System.out.println(s);
        }
    }
}
