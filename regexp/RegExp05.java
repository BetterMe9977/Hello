package com.hspedu.regexp;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

//演示限定符的使用
public class RegExp05 {
    public static void main(String[] args) {

        String content = "a111111aaaaaahello899";
        String regStr1 = "a{3}"; //表示匹配 aaa
        String regStr2 = "1{4}"; //表示匹配 1111
        String regStr3 = "\\d{2}"; //表示匹配 两位任意数字字符

        //注意：java匹配默认是 贪婪匹配，即尽可能匹配多的
        String regStr4 = "a{3,4}"; //表示匹配 aaa 或者 aaaa
        String regStr5 = "1{4,5}"; //表示匹配 1111 或者 11111
        String regStr6 = "\\d{2,5}"; //表示匹配 2位数 或者 3位数 或者 4位数 或者 5位数

        //1+
        String regStr7 = "1+"; //表示匹配 1个1 或者 多个1
        String regStr8 = "\\d+"; //表示匹配 1个数字 或者 多个数字

        //1* (出现0次到任意多次）
        String regStr9 = "1+"; //表示匹配 0个1 或者 多个1

        //?的使用 （出现0次 或 1次）
        String regStr = "a1?"; //表示匹配 a 或者 a1

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到 " + matcher.group(0));
        }
    }
}
