package com.hspedu.string_;

public class StringExercise03 {
    public static void main(String[] args) {
        String a = "hsp";
        String b = new String("hsp");
        System.out.println(a.equals(b)); //比较字符串内容
        System.out.println(a == b);

        //b.intern()方法 最终返回的是常量池的地址
        System.out.println(a == b.intern());
        System.out.println(b == b.intern());

    }
}
