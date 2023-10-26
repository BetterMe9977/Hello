package com.hspedu.codeblock_;

public class CodeBlockDetail04 {
    public static void main(String[] args) {
        //
        //1. 先进行类的加载
        //   先加载父类；  再加载子类
        //2. 创建对象
        //   从子类的构造器开始
        new B2(); //对象
        new C02(); //对象

    }
}
class A2 { //父类
    private static int n1 = getVal01();
    static {
        System.out.println("A2 的一个静态代码块");
    }
    {
        System.out.println("A2 的第一个普通代码块");
    }
    private int n3 = getVal02();
    public static int getVal01() {
        System.out.println("getVal01");
        return 10;
    }

    public int getVal02() {
        System.out.println("getVal02");
        return 10;
    }

    public A2() {
        //隐藏了
        //super() 默认调用无参构造器
        //普通代码块和普通属性的初始化
        System.out.println("A2的构造器");
    }
}

class C02 {
    public int n1 = 100;
    private static int n2 = 200;

    public void m1() {

    }
    private static void m2() {

    }
    static {
        //静态代码块 只能调用静态成员
        // Non-static field 'n1' cannot be referenced from a static context
        //System.out.println(n1);
        System.out.println(n2);

        //Non-static method 'm1()' cannot be referenced from a static context
        //m1();
        m2();
    }

    {
        // 普通代码块 可以使用任意成员
        System.out.println(n1);
        System.out.println(n2);
        m1();
        m2();
    }
}



class B2 extends A2 {

    private static int n3 = getVal03();

    static {
        System.out.println("B2 的一个静态代码块");
    }
    public int n4 = getVal04();
    {
        System.out.println("B2 的第一个普通代码块");
    }

    public static int getVal03() {
        System.out.println("getVal03");
        return 10;
    }
    public int getVal04() {
        System.out.println("getVal04");
        return 10;
    }

    public B2() { //构造器
        //隐藏了
        //super() 默认调用无参构造器
        //普通代码块和普通属性的初始化
        System.out.println("B2的构造器");
    }
}

