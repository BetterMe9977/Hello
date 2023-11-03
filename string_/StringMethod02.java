package com.hspedu.string_;

public class StringMethod02 {
    public static void main(String[] args) {
        //1. toUpperCase 转换成大写
        String s = "hello";
        System.out.println(s.toUpperCase());

        //2. toLowerCase
        System.out.println(s.toLowerCase());

        //3. concat 拼接字符串
        String s1 = "宝玉";
        s1 = s1.concat("林黛玉").concat("薛宝钗").concat("together");
        System.out.println(s1);

        //4. replace 替换字符串中的字符
        s1 = "tom and tom mary mary";
        //在 s1 中，将所有的tom，替换成 jack
        //s1.replace() 方法执行后，返回的结果才是替换过的
        //s1 本身不发生变化
        String s11 = s1.replace("tom","jack");
        System.out.println(s1);
        System.out.println(s11);

        //5. split 分割字符串，对于某些分割字符，我们需要转义，比如 ｜ \\等
        String poem = "锄禾日当午,汗滴禾下土,谁知盘中餐,粒粒皆辛苦";
        //1. 以逗号(,)为标准，对 poem 进行分割，返回一个数组
        String[] split = poem.split(",");
        //2. 在对字符串进行分割时，如果有特殊字符，需要加入转义符 \
        poem = "E:\\aaa\\bbb";
        split = poem.split("\\\\");

        System.out.println("===分割后的内容是===");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);

        //6. toCharArray  转换成字符数组
        s = "happy";
        char[] chs = s.toCharArray();
        for (int j = 0; j < chs.length; j++) {
            System.out.println(chs[j]);

            //7. compareTo 比较两个字符串的大小，如果前者大，则返回正数
            //   如果后者大，则返回负数，如果相等，则返回0
            // 1） 如果长度相同，并且每个字符也相同，就返回0
            // 2） 如果长度相同，或者长度不同， 但是在比较的时候，可以区分大小
            //  就返回  if(c1 != c2) {
            //              return c1 - c2;
           //          }
           //3) 如果前面的部分都相同，就返回 str1.length - str2.length
            String a = "jcck";
            String b = "jack";
            System.out.println(a.compareTo(b)); //返回值是'c' - 'a' = 2的值
            }
        //8. format 格式字符串
            /*
            占位符有：
            %s 字符串   %c 字符   %d 整型   %.2f 浮点型
             */
            String name = "john";
            int age = 10;
            double score = 98.3 / 3;
            char gender = '男';
            //将所有的信息都拼接在一个字符串
            String info = "我的姓名是" + name + "年龄是" + age + "成绩是" + score +
                    "性别是" + gender +
                    "希望大家喜欢我" ;
            System.out.println(info);

            //1. 占位符：%s 字符串   %c 字符char   %d 整型   %.2f 浮点型
            //2. 这些占位符由后面变量来替换
            //3. %.2f 浮点型 表示用小数来替换，只会保留小数点两位，并进行四舍五入的处理
            String formarStr = "我的姓名是%s 年龄是%d 成绩是%.2f 性别是%c 。 希望大家喜欢我";
            String info2 = String.format( formarStr, name , age, score, gender);
            System.out.println("info2=" + info2);

        }
    }
}
