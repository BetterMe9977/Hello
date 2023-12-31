package com.hspedu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//演示转义字符的使用
public class RegExp02 {
    public static void main(String[] args) {

        String content = "abc$(a.bc(123(";
        //匹配
        //在java的正则表达式中，两个\\代表其他语言中的一个\
        //匹配.  要使用 "\\."  ;   "." 表示找到除\n之外每一个字符
        String regStr = "\\(";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);

        while(matcher.find()) {
            System.out.println("找到 " + matcher.group(0));
        }

    }
}
