package com.hspedu.map_;

import java.util.Properties;

public class Properties_ {
    public static void main(String[] args) {

        //1.
        Properties properties = new Properties();
       // properties.put(null,"abc"); //NullPointerException
       // properties.put("john", null); //NullPointerException
        properties.put("john",100);
        properties.put("jack",100);
        properties.put("lucy",100);
        properties.put("mary",100);
        properties.put("mary",80); //替换

        System.out.println("properties" + properties);

        //通过k获取对应的值
        System.out.println(properties.get("lucy"));

        //删除
        properties.remove("mary");
        System.out.println("properties" + properties);

        //修改
        properties.put("john","约翰");
        System.out.println("properties" + properties);
    }
}
