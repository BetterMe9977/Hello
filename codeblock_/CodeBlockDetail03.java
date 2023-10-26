package com.hspedu.codeblock_;

public class CodeBlockDetail03 {
    public static void main(String[] args) {
        new BBB();
    }
}

class AAA { // 父类Object

    {
        System.out.println("AAA 的普通代码块");
    }
    public AAA() {
        //1. 隐含super()
        //2. 调用本类的普通代码块
        System.out.println("AAA() 构造器被调用");
    }
}

class BBB extends AAA {

    {
        System.out.println("BBB 的普通代码块");
    }

    public BBB() {
        //1. 隐含 super()
        //2. 调用本类的普通代码块
        System.out.println("BBB() 构造器被调用");
    }
}