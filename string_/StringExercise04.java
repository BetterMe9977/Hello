package com.hspedu.string_;

public class StringExercise04 {
    public static void main(String[] args) {
        String s1 = "hspedu";  //指向常量池"hspedu"
        String s2 = "java";   //指向常量池 "java"
        String s4 = "java";  //指向常量池 "java"
        String s3 = new String("java");  //指向堆中“Java” 地址
        System.out.println(s2 == s3);
        System.out.println(s2 == s4);
        System.out.println(s2.equals(s3));
        System.out.println(s2 == s1);
    }
}
