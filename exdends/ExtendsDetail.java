package com.hspedu.exdends;

public class ExtendsDetail {
    public static void main(String[] args) {
        System.out.println("===第一个对象===");
        Sub sub = new Sub(); //创建了子类对象 sub
        System.out.println("===第二个对象===");
        Sub sub1 = new Sub("jack"); //创建了子类对象 sub1
        System.out.println("===第三个对象===");
        Sub sub2 = new Sub("king",10); //创建了子类对象 sub2
        sub.sayok();

    }
}
