package com.hspedu.interface_;

//演示多态传递现象
public class InterfacePolyPass {
    public static void main(String[] args) {
        //接口类型的变量 可以指向 实现了该接口的类的对象实例
        IG ig = new Teacher();
        //如果 IG继承了IH 接口， Teacher 类实现了 IG接口
        //则 Teacher 也实现了 IH 接口
        //这就是 接口多态传递现象
        IH ih = new Teacher();

    }
}
interface IH {
    void hi();
}
interface IG extends IH {

}

//Class 'Teacher' must either be declared abstract
// or implement abstract method 'hi()' in 'IH'
class Teacher implements IG {
    @Override
    public void hi() {

    }
}