package com.hspedu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp08 {
    public static void main(String[] args) {

        String content = "hello韩顺平教育 jack韩顺平老师 韩顺平同学hello";

        // 找到 韩顺平教育 韩顺平老师 韩顺平同学 子字符串

        String regStr1 = "韩顺平教育|韩顺平老师|韩顺平同学";
        // 等价非捕获分组  不能使用 matcher.group(1)
        String regStr2 = "韩顺平(?:教育|老师|同学)";

        // 找到 韩顺平教育 韩顺平老师 中的韩顺平
        String regStr3 = "韩顺平(?=教育|老师)";

        // 找到 不是 韩顺平教育 韩顺平老师 中的韩顺平
        String regStr = "韩顺平(?!教育|老师)";

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);

        while (matcher.find()) {
            System.out.println("找到 " + matcher.group(0));
        }
    }
}
