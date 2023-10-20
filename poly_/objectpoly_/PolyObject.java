package com.hspedu.poly_.objectpoly_;

public class PolyObject {
    public static void main(String[] args) {
        //体验对象多态特点

        //animal 编译类型就是 Animal ， 运行类型 Dog
        Animal animal = new Dog();
        animal.cry(); //执行的是 运行类型 Dog 的cry

        //animal 变异类型 Animal ，运行类型 Cat
        animal = new Cat();
        animal.cry();
    }
}
