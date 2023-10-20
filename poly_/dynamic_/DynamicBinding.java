package com.hspedu.poly_.dynamic_;

public class DynamicBinding {
    public static void main(String[] args) {
        //a 的编译类型是A ， 运行类型是B
         A a = new B();
        System.out.println(a.sum());
        System.out.println(a.sum1());
    }
}
class A{
    public int i = 10;

    public int sum() {

        return getI() + 10; //方法getI() 和该对象的运行类型绑定
    }

    public int sum1() {

        return i + 10; //属性i没有动态绑定机制，哪里声明在哪里使用
    }

    public int getI() {
        return i;
    }
}

class B extends A {
    public int i = 20;

    public int sum() {
        return i + 20;
    }

    public int sum1() {
        return i + 10;
    }

    public int getI() {
        return i;
    }

}