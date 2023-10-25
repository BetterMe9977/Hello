package com.hspedu.houserent.service;

import com.hspedu.houserent.domain.House;

/*
【业务层】
定义House[],保存House对象
1.响应 HouseView 的调用
2.完成对房屋信息的各种操作（增删改查）
 */
public class HouseService {
    private House[] houses;//保存House对象
    private int houseNums = 1; //记录当前有多少房屋信息
    private int idCounter = 1; //记录当前的id增长到哪个值

    public HouseService(int size) {
        //new houses
        houses = new House[size]; //当穿件HouseService对象，指定数组大小
        //为了配合测试列表信息， 初始化一个House对象
        houses[0] = new House(1,"jack","112","海淀区",2000,"未出租");
    }

    //findById 方法，返回House对象或null
    public House findById(int findId) {
        for (int i = 0; i < houseNums; i++) {
            if (findId == houses[i].getId()) {
                return houses[i];
            }
        }
        return null;
    }


    //del方法，删除一个房屋信息
    public boolean del(int delId) {
        //应当先找到要删除的房屋信息对应的下标
        //下标和房屋编号不是一回事
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            if (delId == houses[i].getId()) { //要删除的房屋(id),是数组下标为i的元素
                index = i; //就使用index记录i

            }
        }

        if (index == -1) {//说明delId在数组中不存在
            return false;
        }
        //如果找到怎么删除
        for (int i = index; i < houseNums - 1; i++) {
            houses[i] = houses[i + 1];
        }
        houses[--houseNums] = null; //把当前房屋信息的最后一个null

    }




    //add方法，添加新对象，返回boolean
    public boolean add(House newHouse) {
        //判断是否还可以继续添加，暂不考虑扩容问题
        if(houseNums == houses.length) { //不能再添加
            System.out.println("数组已满，不能再添加了...");
            return false;
        }
        houses[houseNums++] = newHouse;
        //设计一个id自增机制
        newHouse.setId(++idCounter);
        return true;
    }


    //list方法，返回houses
    public House[] list() {
        return houses;
    }


}
