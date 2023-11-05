package com.hspedu.collection_;

import java.util.ArrayList;
import java.util.HashMap;

public class Collection_ {
    public static void main(String[] args) {
        //1. 集合 分 单列集合  /  双列集合
        //2. Collection 接口有两个重要的子接口List  Set 它们的实现子类都是单列集合
        //3. Map 接口的实现子类 是双列集合 存放的k-v

        ArrayList arrayList = new ArrayList();
        arrayList.add("jack");
        arrayList.add("tom");

        HashMap hashMap = new HashMap();
        hashMap.put("NO1","shanghai");
        hashMap.put("NO2","beijing");

    }
}
