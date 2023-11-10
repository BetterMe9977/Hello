package com.hspedu.generic.improve;

import java.util.ArrayList;

public class Generic02 {
    public static void main(String[] args) {
        //传统方法解决  ===》》》》 使用泛型解决
        //ArrayList<Dog>  表示存放到 ArrayList 集合中的元素是Dog类型
        //在遍历的时候，可以直接取出Dog类型，而不是Object
        //放入和取出不需要类型转换，提高效率
        // public class ArrayList<E> {}   ,  E 称之为泛型，Dog -> E

        ArrayList<Dog> arrayList = new ArrayList<Dog>();
        arrayList.add(new Dog("旺财",10));
        arrayList.add(new Dog("发财",1));
        arrayList.add(new Dog("小黄",5));

        //编译时，检查元素的类型，提高了安全性
        // 不再提示编译警告
        //假如不小心加入一只猫  //ClassCastException
        /* 编译报错
            Required type:Dog
            Provided:Cat
         */
       // arrayList.add(new Cat("招财猫",8));

        for (Dog dog : arrayList) {
            System.out.println(dog.getName() + "-" + dog.getAge()) ;
        }

        //在遍历的时候，可以直接取出Dog类型，而不是Object
        /*
        //遍历
        for (Object o : arrayList) {
            //向下转型
            Dog dog = (Dog)o;
            System.out.println(dog.getName() + "-" + dog.getAge());

        }
         */

    }
}



class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


class Cat { //猫类
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

