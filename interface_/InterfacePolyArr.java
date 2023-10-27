package com.hspedu.interface_;

public class InterfacePolyArr {
    public static void main(String[] args) {

        //多态数组 ==》 接口类型数组
        Usb[] usbs = new Usb[2];
        usbs[0] = new Phone1();
        usbs[1] = new Camera1();

        for (int i = 0; i < usbs.length; i++) {
            usbs[i].work(); //动态绑定
            //进行类型向下转型
            if (usbs[i] instanceof Phone1) { //判断运行类型是Phone1
                ((Phone1) usbs[i]).call();
            }

        }
    }
}

interface Usb {
    void work();
}
class Phone1 implements Usb {
    public void call() {
        System.out.println("手机可以打电话");
    }

    @Override
    public void work() {
        System.out.println("手机工作中");
    }
}
class Camera1 implements Usb {
    @Override
    public void work() {
        System.out.println("相机工作中");
    }
}