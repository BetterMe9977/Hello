package com.hspedu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//演示正则表达式的使用
public class RegExp11 {
    public static void main(String[] args) {

        //http://www.example.com/index.html
        //URL: "http://www.example.com/questions/3456/my-document"

        String content = "http://www.example.com/questions/3456/my-document";

        String content1 = "http://www.example.com";
        String regStr1 = "^((http|https)://)([\\w-]+\\.)+[\\w-]+$";


        /*
        1. url 开始部分 http://  或者  https://
            ^((http|https)://)?  带? 可有可无
        2. ([\w-]+\.)+[\w-]+$  匹配 www.example.com
        3. (\/[\w-?=&/%.#]*)?  匹配  /questions/3456/my-document

        */
        String regStr = "^((http|https)://)?([\\w-]+\\.)+[\\w-]+(\\/[\\w-?=&/%.#]*)?$";

        //必须使用定位符

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);

        if (matcher.find()) {
            System.out.println("满足格式");
        } else {
            System.out.println("不满足格式");
        }

        //这里使用 Pattern 的 matches 整体匹配，比较简洁，可以不加定位符
        boolean matches = Pattern.matches(regStr,content);
        System.out.println("整体匹配=" + matches);

    }
}
