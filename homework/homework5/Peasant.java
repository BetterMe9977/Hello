package com.hspedu.homework.homework5;

public class Peasant extends Employee{
    //农民，服务生只有基本工资sal

    //方法

    public Peasant(String name, double sal) {
        super(name, sal);
    }

    @Override
    public void printSal() {
        System.out.print("农民 ");
        super.printSal();
    }
}
