package com.hspedu.customgeneric;

import java.util.ArrayList;
import java.util.List;

public class GenericExtends {
    public static void main(String[] args) {
        Object o = new String("xx");

        //泛型没有继承性
        //List<Object> list = new ArrayList<String>();

        //举例说明
        List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<AA0> list3 = new ArrayList<>();
        List<BB0> list4 = new ArrayList<>();
        List<CC0> list5 = new ArrayList<>();

        // List<?> 表示任意泛型都可以接收
        printCollection1(list1);
        printCollection1(list2);
        printCollection1(list3);
        printCollection1(list4);
        printCollection1(list5);

        //?extends AA0 表示 上限，可以接受AA0或者AA0子类
 //       printCollection2(list1);
 //       printCollection2(list2);
        printCollection2(list3);
        printCollection2(list4);
        printCollection2(list5);

        //?super 子类类名AA0： 支持AA0类以及AA0类的父类，不限于直接父类
        //规定了泛型的下限
        printCollection3(list1);
 //       printCollection3(list2);
        printCollection3(list3);
 //       printCollection3(list4);
 //       printCollection3(list5);


    }
    //编写方法
    //List<?> 表示任意泛型都可以接收
    public static void printCollection1(List<?> c) {
        for(Object object : c) { //通配符，取出时，就是Object
            System.out.println(object);
        }
    }

    //?extends AA0 表示 上限，可以接受AA0或者AA0子类
    public static void printCollection2(List<? extends AA0> c) {
        for(Object object : c) {
            System.out.println(object);
        }
    }

    //?super 子类类名AA0： 支持AA0类以及AA0类的父类，不限于直接父类
    //规定了泛型的下限
    public static void printCollection3(List<? super AA0> c) {
        for(Object object : c) {
            System.out.println(object);
        }
    }
}

class AA0 {

}

class BB0 extends AA0 {

}
class CC0 extends BB0 {

}