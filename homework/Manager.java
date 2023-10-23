package com.hspedu.homework;

public class Manager extends Employee {
    //特有属性
    private double bonus;
    //创建Manager对象时，奖金是多少并不是确定的
    // 在构造器中，不给bonus，可以通过setBonus
    //
    public Manager(String name, double daySal, int workDays, double grade) {
        super(name, daySal, workDays, grade);
    }

    //方法：重写父类的 printSal


    @Override
    public void printSal() {
        //因为 Manager 的工资计算公式和 Employee 不一样，所以重写
        System.out.println("经理 " + getName() + " 工资="
                + (bonus + getDaySal() * getWorkDays() * getGrade()));
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
