package com.hspedu.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericDetail {
    public static void main(String[] args) {

        //1.给泛型指向数据类型 要求是引用类型，不能是基本数据类型
        List<Integer> list = new ArrayList<Integer>();
        //List<int> list = new ArrayList<int>();
            //Type argument cannot be of primitive type

        //2.
        // 因为E 制定了 A类型 ， 构造器传入了 new A()
        // 在给泛型指定具体类型后，可以传入该类型或者其子类类型
        Pig<A> aPig = new Pig<A>(new A());
        aPig.f();
        Pig<A> aPig2 = new Pig<A>(new B());
        aPig2.f();

        //3.泛型的使用形式
        ArrayList<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        //在实际开发中，往往简写，推荐使用
        ArrayList<Integer> list3 = new ArrayList<>();
        List<Integer> list4 = new ArrayList<>();

        ArrayList<Pig> pigs = new ArrayList<>();

        //4. 泛型默认Object
        ArrayList arrayList = new ArrayList(); //和下面的方式等价
        ArrayList<Object> objects = new ArrayList<>();


        Tiger tiger = new Tiger(); //  Tiger类如下：
        /*
        class Tiger {
            Object e;

            public Tiger(){
            }

            public Tiger(Object e) {
            this.e = e;
            }
        }

         */
    }
}

class Tiger<E> {
    E e;

    public Tiger(){

    }

    public Tiger(E e) {
        this.e = e;
    }
}

class A {

}
class B extends A{

}
class Pig<E> {
    E e;

    public Pig(E e) {
        this.e = e;
    }

    public void f() {
        System.out.println(e.getClass());
    }
}
