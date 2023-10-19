package com.hspedu.object_;

import java.util.SplittableRandom;

public class EqualsExercise03 {
    public static void main(String[] args) {
        int it = 65;
        float fl = 65.0f;
        System.out.println(it == fl); //t

        char ch1 = 'A';
        char ch2 = 12;
        System.out.println(it == ch1); //t
        System.out.println(12 == ch2); //t

        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println(str1 == str2); //f
        System.out.println(str1.equals(str2)); //t
        //System.out.println("hello" == new java.sql.Date());//不是同一个类型，编译错误


    }
}
