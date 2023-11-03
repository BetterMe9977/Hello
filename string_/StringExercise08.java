package com.hspedu.string_;

public class StringExercise08 {
    public static void main(String[] args) {
        String a = "hello";
        String b = "abc";

        //1. 先创建一个StringBuilder sb = StringBuilder()
        //2. 执行 sb.append("hello");
        //3. 执行 sb.append("abc");
        //4. String c = sb.toString()
        // 最后是c 指向堆中的对象(String) value[] -> 池中 "helloabc"
        String c = a + b;
        // d 指向常量池中"helloabc"
        String d = "helloabc";
        System.out.println(c == d);

        // e 指向常量池中"helloabc"
        String e = "hello" + "abc";
        System.out.println(d == e);
    }
}
