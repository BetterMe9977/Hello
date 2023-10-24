package com.hspedu.homework.homework13;

public class Teacher extends Person {

    private int work_age;

    public Teacher(String name, char sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    public void teach() {
        System.out.println(getName() + "承诺，我会认真教学");
    }

    //重写父类play方法
    @Override
    public String play() {
        return super.play() + "象棋";
    }

    //编写一个输出信息的方法，这样体现封装
    public void printInfo() {
        System.out.println("老师的信息：");
        System.out.println(super.basicInfo());
        System.out.println("工龄：" + work_age);
        teach();
        //play();
        System.out.println(play()); //play();方法使用返回字符串
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "work_age=" + work_age +
                '}' + super.toString();
    }
}
