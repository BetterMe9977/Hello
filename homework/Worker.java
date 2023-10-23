package com.hspedu.homework;

public class Worker extends Employee{
    //分析普通员工没有特有属性

    public Worker(String name, double daySal, int workDays, double grade) {
        super(name, daySal, workDays, grade);
    }

    @Override
    public void printSal() {
        //因为普通员工和Employee输出工资情况一样，所以直接调用父类的printSal()
        System.out.print("普通员工 ");
        super.printSal();
    }
}
