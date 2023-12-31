package com.hspedu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegTheory {
    public static void main(String[] args) {

        String content = "1995年Sun公司首先推出了可以嵌入网页并且可以随同网页在网络上传输的" +
                "Applet（Applet是一种将小程序嵌入到网页中进行执行的技术）1999，并将Oak更名" +
                "为Java。5月23日，Sun公司在Sun world会议上正式发布Java和HotJava浏览器3443。" +
                "IBM、Apple、DEC、Adobe、HP、Oracle、Netscape和微软等各大公司都纷纷" +
                "停止了自己的相关开发项目，竞相购买了Java使用许可证，并为自己的产品开发了" +
                "相应的Java平台9889。";
        //目标：匹配所有四个数字
        //1. \\d 表示一个任意的数字
        String regStr1 = "\\d\\d\\d\\d";
        String regStr = "(\\d\\d)(\\d\\d)";
        //2. 创建模式对象【即正则表达式对象】
        Pattern pattern = Pattern.compile(regStr);
        //3. 创建匹配器
        // 创建匹配器 matcher，按照正则表达式的规则 去匹配 content 字符串
        Matcher matcher = pattern.matcher(content);

        //4. 开始匹配
        /*
        matcher.find()
        1. 根据指定的规则，定位满足规则的子字符串（比如1995）
        2. 找到后，将子字符串的开始的索引记录到 matcher 对象的属性 int[] groups
           groups[0] = 0, 把该子字符串的结束的索引+1的值记录到 groups[1] = 4
        3. 同时记录oldLast 的值为 子字符串的结束的索引+1的值即4，即下次执行find时，就从4开始匹配

        matcher.group(0)
        1. 根据 groups[0] = 0 和 groups[1] = 4 的记录位置，从content开始截取子字符串返回
           就是[0,4) 包含0 但是不包含索引为4的位置

         */


         /*
        matcher.find()  （考虑分组）
        分组： 比如(\d\d)(\d\d)，正则表达式中有() 表示分组，第1个()表示第1组，第2个()表示第2组……
        1. 根据指定的规则，定位满足规则的子字符串（比如(19)(95)）
        2. 找到后，将子字符串的开始的索引记录到 matcher 对象的属性 int[] groups
           groups[0] = 0, 把该子字符串的结束的索引+1的值记录到 groups[1] = 4
           2.2 记录第1组()匹配到的字符串(19)  groups[2] = 0  groups[3] = 2(对应索引+1）
           2.2 记录第2组()匹配到的字符串(95)  groups[4] = 2  groups[5] = 4
           2.3 如果有更多分组依次类推……
        3. 同时记录oldLast 的值为 子字符串的结束的索引+1的值即4，即下次执行find时，就从4开始匹配

        matcher.group(0)
        1. 根据 groups[0] = 0 和 groups[1] = 4 的记录位置，从content开始截取子字符串返回
           就是[0,4) 包含0 但是不包含索引为4的位置

         */
        while(matcher.find()) {
            //
            //1. 如果正则表达式有() 即分组
            //2. 取出匹配的字符串规则如下
            //3. group(0) 表示匹配到的子字符串
            //4. group(1) 表示匹配到的子字符串的第1组字串
            //5. group(2) 表示匹配到的子字符串的第2组字串
            //6. 分组的数不能越界

            System.out.println("找到：" + matcher.group(0));
            System.out.println("第1组()匹配到的值=" + matcher.group(1));
            System.out.println("第2组()匹配到的值=" + matcher.group(2));

            //IndexOutOfBoundsException: No group 3
            //System.out.println("第3组()匹配到的值=" + matcher.group(3));
        }
    }
}
