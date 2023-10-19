package com.hspedu.override_;

public class Animal {
    public void cry() {
        System.out.println("动物叫唤..");
    }

    //细节 ：  子类方法的返回类型和父类方法返回类型一样，或者是父类返回类型的子类
    //   比如： 父类返回类型 Object ，子类返回类型 String
    public Object m1() {
        return null;
    }

    public String m2() {
        return null;
    }
    public AAA m3() {
        return null;
    }

    //细节：子类方法不能缩小父类方法的访问权限
    //public > protected > 默认 > private
    protected void eat() {

    }
}
