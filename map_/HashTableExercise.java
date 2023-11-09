package com.hspedu.map_;

import java.util.Hashtable;

public class HashTableExercise {
    public static void main(String[] args) {
        Hashtable table = new Hashtable();
        table.put("john",100);
        //table.put(null,100); //NullPointerException
       // table.put("john",null); //NullPointerException
        table.put("lucy",100);
        table.put("lic",100);
        table.put("lic",80);//替换
        table.put("hello1", 1);
        table.put("hello2", 1);
        table.put("hello3", 1);
        table.put("hello4", 1);
        table.put("hello5", 1);
        table.put("hello6", 1);
        table.put("hello7", 1);

        System.out.println(table);

        //Hashtable 底层
        //1. 底层有数组 Hashtable$Entry[] 初始化大小为11
        //2. 临界值threshold = 8  11*0.75
        //3. 按照自己的扩容机制扩容


    }
}
