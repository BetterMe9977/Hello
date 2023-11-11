package com.hspedu.customgeneric;

import java.util.ArrayList;

public class CustomMethodGeneric {
    public static void main(String[] args) {
        Car car = new Car();
        car.fly("宝马",100);
        //当调用方法时，传入参数，编译器，就会确定fly(T t, R r)类型
        //fly("宝马",100)  --》 "宝马"-String  ， 100 -》Integer 自动装箱 (泛型都是引用类型）
        System.out.println("=========================");
        car.fly(300,100.1);  // Integer  Double

        System.out.println("=========================");
        //测试
        //Fish<T,R>    --->     Fish<String, ArrayList>
        Fish<String, ArrayList> fish = new Fish<>();
        fish.hello(new ArrayList(),11.3f);
    }
}

//泛型方法，可以定义在普通类中，也可以定义在泛型类中
class Car { //普通类
    public void run() { //普通方法
    }

    // <T,R> 就是泛型
    // 提供给fly使用
    public<T,R> void fly(T t, R r) { //泛型方法
        System.out.println(t.getClass()); //String
        System.out.println(r.getClass());
    }
}

class Fish<T,R> { //泛型类
    public void run() { //普通方法
    }
    public<U,M> void eat(U u, M m) { //泛型方法

    }

    // 下面hi方法不是泛型方法
    //是使用了类声明的泛型
    public void hi(T t) {

    }

    //泛型方法可以使用类声明的泛型，也可以使用自己声明的泛型
    public <K> void hello(R r, K k) {
        System.out.println(r.getClass());
        System.out.println(k.getClass());
    }

}