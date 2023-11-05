package com.hspedu.homework;

import javax.swing.*;

public class Homework03 {
    public static void main(String[] args) {

        String name = "Willian Jefferson Clinton";
        printName(name);
    }

    //编写方法完成输出格式要求的字符串
    //对输出的字符串进行 分割split(" ")
    //对得到的String[] 进行格式化String.format()
    //对输入的字符串进行校验即可
    public static void printName(String str) {

        if (str == null) {
            System.out.println("str 不能为null");
            return;
        }
        String[] names = str.split(" ");
        if (names.length != 3) {
            System.out.println("输入的字符串格式不正确");
            return;
        }
        String format = String.format("%s, %s, .%c", names[2], names[0], names[1].toUpperCase().charAt(0));
        System.out.println(format);
    }
}
