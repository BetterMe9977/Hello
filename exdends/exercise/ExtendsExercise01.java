package com.hspedu.exdends.exercise;

public class ExtendsExercise01 {
    public static void main(String[] args) {
        B b = new B();
    }
}
class A {
    A() {
    }

    A(String name) {
        System.out.println("a name");
    }
}
class B extends A {


    B() {
        this("abc"); //有this不能有super
        System.out.println("b");

    }
    B(String name) {
        super(name);//默认调用父类的无参构造器
        System.out.println("b name");
    }
}