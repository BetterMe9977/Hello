package com.hspedu.annotation_;

import java.util.ArrayList;
import java.util.List;

public class SuppressWarning_ {

    //不希望看到这些警告时，使用SuppressWarning注解来抑制警告信息
    //{""}中可以写入，希望抑制警告的信息
    //
    //SuppressWarning 作用范围，和放置的位置相关
    //可以放在具体的语句，方法，类
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("mary");
        int i;
        System.out.println(list.get(1));

    }

    @SuppressWarnings({"all"})
    public void f1() {
        @SuppressWarnings({"rawtypes"})
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("mary");

        int i;
        System.out.println(list.get(1));

    }
}
