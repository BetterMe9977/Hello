package com.hspedu.generic;

import java.util.ArrayList;

public class Generic01 {
    public static void main(String[] args) {



        //传统方法解决
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Dog("旺财",10));
        arrayList.add(new Dog("发财",1));
        arrayList.add(new Dog("小黄",5));

        //假如不小心加入一只猫
        //ClassCastException
        arrayList.add(new Cat("招财猫",8));

        //对不能加入到集合ArrayList中的数据类型进行约束（不安全）
        //遍历的时候，需要进行类型转换，如果集合中的数据量较大，对效率有影响
        //用泛型来解决

        //遍历
        for (Object o : arrayList) {
            //向下转型
            Dog dog = (Dog)o;
            System.out.println(dog.getName() + "-" + dog.getAge());

        }

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
