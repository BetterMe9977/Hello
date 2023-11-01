package com.hspedu.try_;

public class TryCatchDetail {
    public static void main(String[] args) {

        //如果异常发生，则异常后面的代码不会执行，直接进入到catch块
        //如果异常没有发生，则顺序执行try的代码块，不会进入到catch块
        //如果不管异常是否发生，都执行某代码(比如关闭连接，释放资源等)，使用finally

        try {
            String str = "123";
            int a = Integer.parseInt(str);
            System.out.println("数字" + a);

            String str2 = "韩顺平";
            int a2 = Integer.parseInt(str2);
            System.out.println("数字" + a2);

        } catch (NumberFormatException e) {
            System.out.println("异常信息=" + e.getMessage());
        } finally {
            System.out.println("finally代码块被执行");
        }
        System.out.println("程序继续");
    }
}
