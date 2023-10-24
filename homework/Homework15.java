package com.hspedu.homework;

public class Homework15 {
    public static void main(String[] args) {
        A obj = new B();
        A b1 = obj;
        System.out.println("obj的运行类型=" + obj.getClass()); //B
        obj = new C(); //向上转型
        System.out.println("obj的运行类型=" + obj.getClass()); //C
        obj = b1;
        System.out.println("obj的运行类型=" + obj.getClass()); //B
    }
}

class A { //超类

}
class B extends A { //父类

}
class C extends B { //子类

}
