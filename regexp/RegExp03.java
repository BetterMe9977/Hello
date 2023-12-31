package com.hspedu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//演示字符匹配符的使用
public class RegExp03 {
    public static void main(String[] args) {

        String content = "a11c8.abc \\n _ABCy@";
        String regStr1 = "[a-z]"; //匹配a-z之间任意一个字符
        String regStr2 = "[A-Z]"; //匹配A-Z之间任意一个字符
        String regStr3 = "abc"; //匹配abc字符串，默认区分大小写
        String regStr4 = "(?i)abc"; //匹配abc字符串，区分大小写
        String regStr5 = "[0-9]"; //匹配0-9之间任意一个字符
        String regStr6 = "[^a-z]"; //匹配不在a-z之间任意一个字符
        String regStr7 = "[^0-9]"; //匹配0-9之间任意一个字符
        String regStr8 = "[abcd]"; //匹配在 abcd 中的任意一个字符
        String regStr9 = "\\D"; //匹配不在 0-9 中的任意一个字符
        String regStr10 = "\\w"; //匹配 大小写英文字母 数字 下划线
        String regStr11 = "\\W"; // "\\w" 取反， 匹配[^a-zA-Z0-9_]
        String regStr12 = "\\s"; // 匹配空白字符
        String regStr13 = "\\S"; // 匹配任何非空白字符
        String regStr14 = "."; // 匹配除\n之外的全部字符
        String regStr = "\\."; // 匹配.


        //说明
        //当创建 Pattern 对象时，指定 Pattern.CASE_INSENSITIVE, 表示匹配是不区分字母大小写
        //Pattern pattern = Pattern.compile(regStr,Pattern.CASE_INSENSITIVE);
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);

        while (matcher.find()) {
            System.out.println("找到 " + matcher.group(0));
        }

    }

}
