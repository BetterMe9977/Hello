package com.hspedu.homework;

public class VehiclesFactory {
    //马儿始终是同一匹马
    private static Horse horse = new Horse();
    private VehiclesFactory() {//构造器私有化
    }
    //创建交通工具工厂类，有两个方法分别获得交通工具Hores 和 Boat
    //将方法做成static 比较方便

    public static Horse getHorse() {
        return new Horse();
    }
    public static Boat getBoat() {
        return new Boat();
    }
    public static Plane getPlane() {
        return new Plane();
    }
}
