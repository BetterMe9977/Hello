package com.hspedu.homework;

public class Person {
    private String name;
    private Vehicles vehicles;


    //在创建Person对象时，实现给他分配一个交通工具
    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
    //实例化Person对象“唐僧”，要求一般情况下用Horse作为交通工具，遇到大河时用Boat作为交通工具
    //编程思路：把具体的要求，封装成方法 ==》编程思想
    //如何不浪费，在构建对象时，传入的交通工具对象
    public void passRiver() {
        //先得到船
        //Boat boat = VehiclesFactory.getBoat();
       // boat.work();
        //判断一下，当前的vehicles 属性是 null , 就获取一艘船
        //if(vehicles == null) {
        //vehicles instanceof Boat 判断 当前的 vehicles 是不是 Boat
        //1）vehicles = null ： vehicles instanceof Boat  为 false
        //2）vehicles = Horse ： vehicles instanceof Boat  为 false
        //3）vehicles = Boat ： vehicles instanceof Boat  为 true
        if(!(vehicles instanceof Boat)) {
            //使用的是多态
            vehicles = VehiclesFactory.getBoat();
        }
        // 体现使用接口调用
        vehicles.work();
    }
    public void common() {
        //得到马儿
        //判断一下，当前的vehicles 属性是 null , 就获取一匹马
        //if(vehicles == null) {
        if(!(vehicles instanceof Horse)) {
            //使用的是多态
            vehicles = VehiclesFactory.getHorse();
        }
        // 体现使用接口调用
        vehicles.work();
    }

    //过火焰山
    public void passFireHill() {
        if(!(vehicles instanceof Plane)) {
            //使用的是多态
            vehicles = VehiclesFactory.getPlane();
        }
        // 体现使用接口调用
        vehicles.work();
    }
}
