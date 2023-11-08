package com.hspedu.set_;

import java.util.HashSet;

public class HashSet01 {
    public static void main(String[] args) {

        HashSet set = new HashSet();

        //1. 在执行add方法后，会返回一个boolean值
        //2. 添加成功 返回true ， 添加失败，返回false
        //3. 可以通过remove指定删除哪个对象
        //4. 顺序是无序的
        System.out.println(set.add("john"));
        System.out.println(set.add("lucy"));
        System.out.println(set.add("john"));
        System.out.println(set.add("jack"));
        System.out.println(set.add("Rose"));

        set.remove("john");
        System.out.println("set=" + set);

        //

        set = new HashSet();
        System.out.println("set=" + set);
        //4. Hashset 不能添加相同的元素/数据
        set.add("lucy"); //添加成功
        set.add("lucy"); //添加失败
        set.add(new Dog("tom"));
        set.add(new Dog("tom"));
        System.out.println("set=" + set);

        // 看源码
        set.add(new String("hsp")); //加入成功
        set.add(new String("hsp")); //加入失败
        System.out.println("set=" + set);

    }
}

class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
