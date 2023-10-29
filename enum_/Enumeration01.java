package com.hspedu.enum_;

public class Enumeration01 {
    public static void main(String[] args) {
        //
        Season spring = new Season("spring", "warm");
        Season winter = new Season("winter", "cold");
        Season summer = new Season("summer", "hot");
        Season autumn = new Season("autumn", "cool");
        //因为对于季节而言，他的对象（具体值），是固定四个，不会有更多
        //这个设计思路，不能体现季节是4个固定的对象
        //====》》枚举：一个一个列举，
        // 即把具体的对象一个一个列举出来的类就成为枚举类
    }
}
class Season { //类
    private String name;
    private String desc;//描述

    public Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}