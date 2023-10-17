package com.hspedu.exdends;

//输入ctrl + H 可以看到类的继承关系
public class Sub extends Base{ //子类
    public Sub(String name, int age) { //构造器
        //1.调用父类的无参构造器
       // super();// 调用父类的无参构造器，或者默认不写，
        //2.调用父类的 Base(String name) 构造器
        //super("hsp");
        //3.调用父类的 Base(String name, int age) 构造器
        super("king",20);

        //4.super 在使用时，必须放在构造器第一行
        //5.super（）和 this（）都只能放在构造器第一行，因此这两个方法不能共存在一个构造器
        //this（）不能再使用了
        System.out.println("子类sub(String name, int age)...构造器被调用");
    }

    public Sub() { //构造器
        //super(); //默认调用父类的无参构造器
        super("smith",10);
        System.out.println("子类sub()...构造器被调用");
    }
    public Sub(String name) {
        super("tom",30);
        System.out.println("子类sub(String name)...构造器被调用");
    }
    public void sayok() { //子类方法
        //非私有的属性和方法可以在子类直接访问
        //私有的属性和方法不能在子类直接访问
        System.out.println(n1 + " " + n2 + " " + n3);
        test100();
        test200();
        test300();
        //test400(); 错误
        //要通过父类提供的公共方法去访问
        System.out.println("n4=" + getN4());
        callTest400();//
    }
}
