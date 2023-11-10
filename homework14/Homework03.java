package com.hspedu.homework;

import java.util.*;

public class Homework03 {
    public static void main(String[] args) {
        Map m = new HashMap();
        Employee tom = new Employee("tom", 650);
        Employee jack = new Employee("jack", 1200);
        Employee smith = new Employee("smith", 2900);
        m.put("tom", 650);//int->Integer 自动装箱
        m.put("jack", 1200);
        m.put("smith", 2900);
        System.out.println(m);

        m.put("jack",2600);//替换
        System.out.println(m);

        //为所有员工增加薪水100
        //keyset
        Set keySet = m.keySet();
        for(Object key: keySet) {
            //更新
            m.put(key,(Integer)m.get(key) + 100); // m.get(key)是Object 类型，向下转型
        }
        System.out.println(m);

        //遍历 EntrySet
        Set entrySet = m.entrySet();
        //迭代器
        Iterator iterator = entrySet.iterator();
        while(iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

        System.out.println("========遍历所有的工资========");
        Collection values = m.values();
        for(Object value : values) {
            System.out.println("工资=" + value);
        }


    }

}
class Employee {
    private String name;
    private int sal;

    public Employee(String name, int sal) {
        this.name = name;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }
}