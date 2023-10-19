package com.hspedu.super_;

public class B extends A {

    public int n1 = 888;

    //编写测试方法
    public void test() {
        //super 的访问不限于直接父类，也可以访问更上级类成员
        //若多个上级类中都有同名成员，使用super访问遵循就近原则。A- B- C
        System.out.println("super.n1=" + super.n1);
        super.cal();
    }

    //访问父类的属性，但不能访问父类的private属性 (super.n4) super.属性名
    public void hi() {
        System.out.println(super.n1 + " " + super.n2 + " " + super.n3 );
    }
    public void cal() {
        System.out.println("B类的cal（）方法...");

    }
    public void sum(){
        System.out.println("B类的sum（）");
        //希望调用父类A的cal方法
        //因为子类B没有cal方法，因此有下面三种方法
        //找cal方法时（ cal() 和 this.cal()），顺序是：
        //1）先找本类，如果有，则调用；
        // 2）如果没有，则找父类（若父类有，并且可以调用，则调用）
        //3）如果父类没有，则继续找父类的父类，直到Object类
        //提示： 若查找方法过程中，找到了，但是不能访问，则报错 cannot access
        //      若查找方法过程中，没有找到，则提示方法不存在
        cal();
        this.cal(); //等价于cal();
        //找cal方法（super.cal()），直接查找父类，其他规则一样
        super.cal();

        //演示访问属性的规则
        //n1和this.n1 查找规则是
        //1）先找本类，如果有，则调用；
        // 2）如果没有，则找父类（若父类有，并且可以调用，则调用）
        //3）如果父类没有，则继续找父类的父类，直到Object类
        //提示： 若查找方法过程中，找到了，但是不能访问，则报错 cannot access
        //      若查找方法过程中，没有找到，则提示方法不存在
        System.out.println(n1);
        System.out.println(this.n1);
        //直接查找父类属性，其他规则一样
        System.out.println(super.n1);
    }

    //访问父类的方法，但不能访问父类的private方法  super.方法名（参数列表）
    public void ok() {
        super.test100();
        super.test200();
        super.test300();
        //super.test400(); //不能访问父类的private方法

    }
    //访问父类的构造器：super（参数列表）；只能放在构造器的第一句，只能出现一句
    public B() {
        // super(); //调用父类无参构造器
        // super("tom"); //调用父类 public A(String name) {}构造器
        super("jack", 10); // 调用父类 public A(String name, int age) {}构造器

    }
}
