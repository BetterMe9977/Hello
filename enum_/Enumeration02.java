package com.hspedu.enum_;

public class Enumeration02 {

    public static void main(String[] args) {
        //
        //Season0 spring = new Season0("spring", "warm");
       // Season0 winter = new Season0("winter", "cold");
       // Season0 summer = new Season0("summer", "hot");
       // Season0 autumn = new Season0("autumn", "cool");
        //因为对于季节而言，他的对象（具体值），是固定四个，不会有更多
        //这个设计思路，不能体现季节是4个固定的对象
        //====》》枚举：一个一个列举，
        // 即把具体的对象一个一个列举出来的类就成为枚举类

        System.out.println(Season0.AUTUMN);
        System.out.println(Season0.SPRING);
    }
}

//演示自定义枚举实现
class Season0 { //类
    private String name;
    private String desc;//描述


   //定义了4个对象，固定
    public final static Season0 SPRING = new Season0("spring", "warm");
    public final static Season0 WINTER = new Season0("winter", "cold");
    public final static Season0 SUMMER = new Season0("summer", "hot");
    public final static Season0 AUTUMN = new Season0("autumn", "cool");


    //1. 将构造器私有化， 目的：防止直接 new
    //2. 去掉setXxx方法， 目的：防止属性被修改
    //3. 在Season0 内部，直接创建固定的对象
    //4. 优化： 加入final修饰符
    private  Season0(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }



    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season0{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
