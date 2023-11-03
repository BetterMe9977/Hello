package com.hspedu.string_;

public class StringMethod01 {
    public static void main(String[] args) {
        //1. equals 比较内容是否相同，区分大小写
        String str1 = "hello";
        String str2 = "Hello";
        System.out.println(str1.equals(str2));

        //2. equalsIgnoreCase 忽略大小写的判断内容是否相等
        String username = "John";
        if ("john".equalsIgnoreCase(username)) {
            System.out.println("Success");
        } else {
            System.out.println("Failure");
        }

        //3. length 获取字符的个数，字符的长度
        System.out.println("hello".length());

        //4. indexOf 获取字符在字符串对象中第一次出现的索引，索引从0开始，若找不到，返回-1
        String s1 = "where@are@you";
        int index = s1.indexOf('@');
        System.out.println(index);
        System.out.println(s1.indexOf("re"));

        //5. lastIndexOf 获取字符在字符串中最后一次出现的索引，索引从0开始，若找不到，返回-1
        s1 = "where@are@you";
        index = s1.lastIndexOf('@');
        System.out.println(index);
        System.out.println(s1.lastIndexOf("re"));

        //6. substring 截取指定范围的字串
        String name = "hello,jack";
        // name.substring(6) 从索引6开始截取后面所有的内容
        System.out.println(name.substring(6));
        //name.substring(0,5) 从索引2开始，截取到索引为（5-1）
        System.out.println(name.substring(0,5));
        //name.substring(0,5) 从索引2开始，截取到索引为（5-1）
        System.out.println(name.substring(2,5));
    }
}
