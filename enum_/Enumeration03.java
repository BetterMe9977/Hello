package com.hspedu.enum_;

public class Enumeration03 {
    public static void main(String[] args) {
        System.out.println(Season2.AUTUMN);
        System.out.println(Season2.SUMMER);

    }
}

enum Season2 {
    //类



    //定义了4个对象，固定
    //public final static Season2 SPRING = new Season2("spring", "warm");
   // public final static Season2 WINTER = new Season2("winter", "cold");
   // public final static Season2 SUMMER = new Season2("summer", "hot");
   // public final static Season2 AUTUMN = new Season2("autumn", "cool");

    //使用 enum 来实现枚举
    //1. 如果使用了 enum 替代 class
    //2. public final static Season2 = new Season2("spring", "warm");换成直接使用
    //   SPRING("spring", "warm");   常量名（实参列表）
    //3. 如果有多个常量（对象），使用逗号间隔即可
    //4. 如果使用enum来实现枚举，要求将定义常量对象，写在前面
    //   枚举对象必须放在枚举类的行首
    //5. 如果我们使用的是无参构造器，创建常量对象，则可以省略()
    //Parameter expected
    SPRING ("spring", "warm"), WINTER ("winter", "cold"),
    SUMMER("summer", "hot"),AUTUMN ("autumn", "cool");
    //HAPPY(); //使用无参构造器，()可以省略
    private String name;
    private String desc;//描述

    private Season2() {//无参构造器

    }

    private  Season2(String name, String desc) {
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

