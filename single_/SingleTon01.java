package com.hspedu.single_;

public class SingleTon01 {
    public static void main(String[] args) {
       // GirlFriend mary = new GirlFriend("mary");
       // GirlFriend lucy = new GirlFriend("lucy");

        //通过方法可以获取对象
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance);

        GirlFriend instance2 = GirlFriend.getInstance();
        System.out.println(instance);

        System.out.println(instance == instance2);
    }
}

//有一个类。GirlFriend
class GirlFriend {

    private String name;

    //为了能够在静态方法中，返回 gf对象，需要将其修饰为 static
    //创建了new GirlFriend("lily"); 但是没有使用，浪费
    private static GirlFriend gf = new GirlFriend("lily");

    //如何保证只能创建一个 GirlFriend 对象
    //1.将构造器私有化
    //2.在类的内部直接创建
    //3.提供一个公共的static方法，返回gf对象
    private GirlFriend(String name) {
        this.name = name;
    }

    public static GirlFriend getInstance() {
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}
