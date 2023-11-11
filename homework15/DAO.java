package com.hspedu.homework;

import java.util.*;

public class DAO<T>{  //泛型类
    private Map<String, T> map = new HashMap<>();

    public T get(String id) {
        return map.get(id);
    }
    public void update(String id, T entity) {
        map.put(id,entity);
    }

    //遍历map，将map所有的value（T entity），封装到ArrayList返回即可
    public List<T> list() {
        //创建ArrayList
        List<T> list = new ArrayList<>();

        //遍历map
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            //map.get(key) 返回的是User对象， ArrayList
            list.add(map.get(key)); // 也可以直接使用本类的 get(String id)
        }

        return list;
    }
    public void delete(String id) {
        map.remove(id);
    }
    public void save(String id, T entity) {
        map.put(id,entity);
    }
}
