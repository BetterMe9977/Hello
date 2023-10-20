package com.hspedu.poly_.detail_;



public class PolyDetail {
    public static void main(String[] args) {

        //向上转型：父类的引用指向了子类的对象
        //语法：父类类型引用名 = new 子类类型();
        Animal animal = new Cat();
        Object obj = new Cat();//Object 也是 Cat的父类

        //向上转型调用方法规则如下：
        //1）可以调用父类的所有成员（遵循访问权限）
        //2）不能调用子类的特有的成员
        //3）在编译阶段，能调用哪些成员，是由编译类型来决定的
        //animal.catchMouse();  错误，子类Cat的特有成员，不能调用
        //4）最终的运行效果看子类的具体实现，调用方法 从子类（运行类型）开始查找

        animal.eat();
        animal.run();
        animal.show();
        animal.sleep();

        //调用Cat 的catchMouse 方法
        //多态的向下转型
        //语法：子类类型 引用名 = （子类类型）父类引用；
        //cat的编译类型是 Cat，运行类型是 Cat
        Cat cat = (Cat) animal;
        cat.catchMouse();
        //要求父类的引用必须指向的是当前目标类型的对象
        //Dog dog = (Dog) animal;
    }
}
