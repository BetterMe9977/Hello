package com.hspedu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//演示定位符的使用
public class RegExp06 {
    public static void main(String[] args) {

        String content1 = "123-abc";
        String content = "hanshunping sphan nnhan";
        //以至少1个数字开头，后接任意个数小写字母的字符串
        String regStr1 = "^[0-9]+[a-z]*";
        //以至少1个数字开头，必须至少1个小写字母结尾的字符串
        String regStr2 = "^[0-9]+\\-[a-z]+$";

        //表示匹配边界 结尾或右侧空格
        String regStr3 = "han\\b";
        String regStr = "han\\B";   //和 "han\\b" 相反 ， 开头或者左侧空格
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);

        while (matcher.find()) {
            System.out.println("找到 " + matcher.group(0));
        }
    }
}
