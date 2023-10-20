package com.hspedu.poly_.detail_;
//instanceof 判断
// 对象的运行类型是否为xx类型或其子类
public class PolyDetail03 {
    public static void main(String[] args) {
        BB bb = new BB();
        System.out.println(bb instanceof BB);
        System.out.println(bb instanceof AA);

        //aa 编译类型是AA ， 运行类型是BB
        AA aa = new BB();
        System.out.println(aa instanceof AA);
        System.out.println(aa instanceof BB);

        Object obj = new Object();
        System.out.println(obj instanceof AA);
        String str = "hello";
        //System.out.println(str instanceof AA);
        System.out.println(str instanceof Object);

    }
}
class AA{

}
class BB extends AA{

}
