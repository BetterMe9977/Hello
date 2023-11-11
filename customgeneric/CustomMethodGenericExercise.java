package com.hspedu.customgeneric;

public class CustomMethodGenericExercise {
    public static void main(String[] args) {

        //Apple<T, R, M>  -->  Apple<String, Integer, Double>
        Apple<String, Integer, Double> apple = new Apple<>();
        apple.fly(10);  // Integer 自动装箱
        apple.fly(new Dog()); //Dog
    }
}

class Apple<T, R, M> { //自定义泛型类

    public <E> void fly(E e) { //泛型方法
        System.out.println(e.getClass().getSimpleName());
    }

    //public void eat(U u){}  //Cannot resolve symbol 'U'

    public void run(M m) {

    }

}
class Dog {

}


