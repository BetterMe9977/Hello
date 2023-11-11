package com.hspedu.customgeneric;

public class CustomInterfaceGeneric {
    public static void main(String[] args) {

    }
}
//在继承接口 指定泛型接口的类型
interface IA extends IUsb<String,Double> {

}
//当我们去实现IA接口时，因为IA在继承IUsu接口时，指定了U为String，  R为Double
//在实现IUsu接口方法时，使用String替换U， Double替换R
//Class 'AA' must either be declared abstract
//or implement abstract method 'get(U)' in 'IUsb'
class AA implements IA {

    @Override
    public Double get(String s) {
        return null;
    }

    @Override
    public void hi(Double aDouble) {

    }

    @Override
    public void run(Double r1, Double r2, String u1, String u2) {

    }
}

// 实现接口时，直接指定泛型接口的类型
class BB implements IUsb<Integer, Float> {

    @Override
    public Float get(Integer interger) {
        return null;
    }

    @Override
    public void hi(Float aFloat) {

    }

    @Override
    public void run(Float r1, Float r2, Integer u1, Integer u2) {

    }
}

//没有指定类型，默认Object
//建议写IUsb <Object,Object>
class CC implements IUsb {
//等价  class CC implements IUsb <Object,Object>
    @Override
    public Object get(Object o) {
        return null;
    }

    @Override
    public void hi(Object o) {

    }

    @Override
    public void run(Object r1, Object r2, Object u1, Object u2) {

    }
}
interface IUsb<U,R> {

    int n = 10;
    //U name; // 接口中 成员都是静态的
    //普通方法中，可以使用接口泛型
    R get(U u); //abstract 方法

    void hi(R r);

    void run(R r1, R r2, U u1, U u2);

    //在jdk8中，可以在接口中，使用默认方法，也可以使用泛型
    default R method(U u) {
        return null;
    }
}
