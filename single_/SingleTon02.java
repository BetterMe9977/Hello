package com.hspedu.single_;

import javax.xml.catalog.Catalog;

//懒汉式的单例模式
public class SingleTon02 {
    public static void main(String[] args) {
        //'Cat(java.lang.String)' has private access in 'com.hspedu.single_.Cat'
        //new Cat();

        System.out.println(Cat.n1);
        Cat instance = Cat.getInstance();
        System.out.println(instance);

        Cat instance2 = Cat.getInstance();
        System.out.println(instance2);

        System.out.println(instance == instance2);
    }
}

//只能创建一个Cat对象
class Cat {
    private String name;
    public static int n1 = 999;
    private static Cat cat;

    //步骤
    //1. 构造器私有化
    //2. 定义一个static静态对象
    //3. 提供一个public 的static 方法， 可以返回一个Cat对象
    //4. 懒汉式，只有当用户使用getInstance时，才会返回cat对象，后面再次调用时，
    //   会返回上次创建的cat对象，从而保证单例

    private Cat(String name) {
        System.out.println("构造器调用");
        this.name = name;
    }

    public static Cat getInstance() {

        if (cat == null) { //如果还没有创建Cat对象
            cat = new Cat("cute");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
