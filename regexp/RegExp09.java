package com.hspedu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp09 {
    public static void main(String[] args) {

        String content = "hello111111 ok";
        String regStr1 = "\\d+"; //默认贪婪匹配，尽可能多
        String regStr = "\\d+?"; //非贪婪匹配，尽可能少


        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);

        while (matcher.find()) {
            System.out.println("找到 " + matcher.group(0));
        }
    }
}
