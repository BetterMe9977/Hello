package com.hspedu;

public class Cat {

    private String name = "tom";
    public int age = 10;

    public Cat(){} //无参构造器
    public Cat(String name) {
        this.name = name;
    }
    public void hi() { //成员方法
       // System.out.println("hi " + name);
    }

    public void cry() {
        System.out.println(name + "  meo^^");
    }
}
