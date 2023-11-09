package com.hspedu.map_;

import java.util.HashMap;
import java.util.Map;

public class Map_ {
    public static void main(String[] args) {


        //1. Map 用于保存具有映射关系的数据：Key-Value
        //2. Map 中的key 和 value 可以引用任何类型的数据，会封装到HashMap$Node 对象中
        //3. Map 中的key 不可以重复
        //4. Map 中的value 可以重复
        //5. Map 的key 可以为null，且只能有一个
        //   value 也可以为null
        //6. 常用 String 类作为Map的key
        //7. key 和 value 之间存在一对一的关系，即通过指定的key 可以找到对应的value

        Map map = new HashMap();
        map.put("no1","hsp"); //k-v
        map.put("no2","tom");
        map.put("no1","mary"); //相同的key，等价于替换
        map.put("no3","mary");
        map.put(null,null);
        map.put(null,"abc"); //等价替换
        map.put("no4",null); //k-v
        map.put("no5",null);
        map.put(1,"smith");
        map.put(new Object(),"lucy");

        System.out.println(map.get(1));

        System.out.println("map=" + map);

    }
}
