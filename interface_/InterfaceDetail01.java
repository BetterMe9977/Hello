package com.hspedu.interface_;

public class InterfaceDetail01 {
    public static void main(String[] args) {

        //'IA' is abstract; cannot be instantiated
        //new IA();

    }
}

//1. 接口不能被实例化 is abstract; cannot be instantiated
//2. 接口中所有的方法是 public方法，接口中抽象方法，可以不用abstract 修饰
//3. 一个普通类实现接口，就必须将该接口的所有方法都实现
interface IA {
    void say();
    void hi();
}

class Cat implements IA {

    @Override
    public void say() {

    }

    @Override
    public void hi() {

    }

abstract class Tiger implements IA {
   // Class 'Tiger' must either be declared abstract
    // or implement abstract method 'say()' in 'IA'
}
}

