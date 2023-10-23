package com.hspedu.homework.homework5;

public class Teacher extends Employee{ //子类

    //特有属性
    private int classDays; //一年上课次数
    private double classSal; //课时费

    public Teacher(String name, double sal) {
        super(name, sal);
    }

    @Override
    public void printSal() {
        //老师不能使用 super.printSal()
        System.out.print("老师 ");
        System.out.println(getName() + " 年工资是: "
                + (getSal() * getSalMonth() + classDays * classSal) );

    }

    public int getClassDay() {
        return classDays;
    }

    public void setClassDay(int classDay) {
        this.classDays = classDay;
    }

    public double getClassSal() {
        return classSal;
    }

    public void setClassSal(double classSal) {
        this.classSal = classSal;
    }
}
