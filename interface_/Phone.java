package com.hspedu.interface_;

import java.lang.reflect.GenericDeclaration;

//Phone 类实现 UsbInterface
//1. Phone 类 需要实现 UsbInterface接口 规定/声明的方法
public class Phone implements UsbInterface{ //实现接口，就是实现接口方法

    @Override
    public void start() {
        System.out.println("手机开始工作...");
    }

    @Override
    public void stop() {
        System.out.println("手机停止工作...");
    }
}
