package com.hspedu.try_;

import java.util.Scanner;

public class TryCatchExercise04 {
    public static void main(String[] args) {
        //如果用户输入的不是一个整数，就提示他反复输入，直到输入一个整数为止
        //1.创建Scanner对象
        //2.使用无限循环，接收输入
        //3.将输入的值转成int
        //4.如果转换时候，抛出异常，说明输入的内容不是一个可以转成int的内容
        //5.如果没有抛出异常，则break 该循环
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        String intputStr = "";
        while(true) {
            System.out.println("请输入一个整数：");
            intputStr = scanner.next();
            try {
                num = Integer.parseInt(intputStr); //这里是可能抛出异常
                break;
            } catch (NumberFormatException e) {
                System.out.println("你输入的不是一个整数");
            }

        }
        System.out.println("你输入的值是=" + num);
    }
}
