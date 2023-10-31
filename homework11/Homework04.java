package com.hspedu.homework;

public class Homework04 {
    public static void main(String[] args) {

        //匿名内部类
        /*
            new ICalculate() {
                @Override
                public double work(double n1, double n2) {
                    return n1 + n2;
                }
            },10,8);
            同时也是一个对象
            它的编译类型是ICalculate，运行类型是  匿名内部类
         */
        Cellphone cellphone = new Cellphone();
        cellphone.testWork(new ICalculate() {
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;
            }
        },10,8);

        cellphone.testWork(new ICalculate() {
            @Override
            public double work(double n1, double n2) {
                return n1 * n2;
            }
        },10,8);
    }
}
interface ICalculate {
    public double work(double n1, double n2);
}
class Cellphone {
    //当调用 testWork 方法时，直接传入一个实现了ICalculate接口的匿名内部类即可
    //该匿名内部类，可以灵活的实现work，完成不同的计算任务
    public void testWork(ICalculate iCalculate, double n1, double n2) {
        double result = iCalculate.work(n1, n2); //动态绑定，运行类型是匿名内部类
        System.out.println("计算后的结果是=" + result);
    }
}
