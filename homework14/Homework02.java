package com.hspedu.homework;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Homework02 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        Car car = new Car("宝马", 400000);
        Car car2 = new Car("宾利", 5000000);
        //1. 添加
        arrayList.add(car);
        arrayList.add(car2);
        System.out.println(arrayList);

        //2. remove 删除指定元素
        arrayList.remove(car);
        System.out.println(arrayList);

        //3. contains: 查找元素是否存在
        System.out.println(arrayList.contains(car));

        //4. size: 获取元素个数
        System.out.println(arrayList.size());

        //5. isEmpty 是否空
        System.out.println(arrayList.isEmpty());

        //6.clear: 清空
        arrayList.clear();
        System.out.println(arrayList);

        //7.addAll: 添加多个元素
        arrayList.add(car2);
        System.out.println(arrayList);
        arrayList.addAll(arrayList);
        System.out.println(arrayList);

        //8. containsAll: 查找多个元素是否都存在
        System.out.println(arrayList.containsAll(arrayList));
        System.out.println(arrayList);

        //9. removeAll: 删除多个元素
        //arrayList.removeAll(arrayList); //相当于清空
        System.out.println(arrayList);

        //10. 使用增强for 和 迭代器来遍历所有的 car，需要重写 Car 的 toString 方法
        System.out.println("=======增强for=======");
        for (Object o : arrayList) {
            System.out.println(o);

        }

        System.out.println("=======迭代器=======");
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }

    }
}

class Car {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
