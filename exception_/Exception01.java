package com.hspedu.exception_;

public class Exception01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        //1. num1 / num2 =》 10 / 0
        //2. 当执行到 num1 / num2 ，因为 num2 = 0 ，程序就会出现（抛出）异常，ArithmeticException
        //3. 当抛出异常后，程序就退出，崩溃，下面的代码就不再执行。
        //4. 不应该出现一个不算致命的错误，就导致系统崩溃
        //5， Java设计者，提供了一个叫 异常处理机制来解决这个问题
    //  int res = num1 / num2;
        //如果认为一段代码可能出现异常/问题，可以使用try-catch异常处理机制来解决
        //从而摆正程序的健壮性

        try {
            int res = num1 / num2;
        } catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println("出现异常的原因=" + e.getMessage());
        }
        System.out.println("程序继续运行");
    }
}
