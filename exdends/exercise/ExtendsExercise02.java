package com.hspedu.exdends.exercise;

import org.w3c.dom.ls.LSOutput;

public class ExtendsExercise02 {
    public static void main(String[] args) {
        C c = new C();
    }
}
class AA {

    public  AA() {
        System.out.println("我是A类");

    }
}
class BB extends AA { //
    public BB(String name) {
        System.out.println(name + "我是B类的有参构造器");
    }
}

class C extends BB {
    public C () {
        this("hello");
        System.out.println("我是c类的无参构造器");
    }
    public C(String name) {
        super("hahaha");
        System.out.println("我是c类的有参构造器");
    }

}
