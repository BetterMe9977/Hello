package com.hspedu.customexception_;

public class CustomException {
    public static void main(String[] args) {

        int age = 80;
        //范围在18-120 否则抛出一个自定义异常
        if (!(age >= 18 && age <= 120)) {
            throw new AgeException("年龄需要在18-120之间");
        }
        System.out.println("你的年龄范围正确");
    }
}
//自定义一个异常
//通常自定义异常继承 RuntimeException
//把自定义异常做成 运行异常 好处是我们可以使用默认的处理机制
class AgeException extends RuntimeException {
    public AgeException(String message) { //构造器
        super(message);
    }
}
