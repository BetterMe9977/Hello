package com.hspedu.override_;

//继承Person类，增加id，score，属性 private，以及构造器，定义say方法（返回自我介绍的信息）
public class Student extends Person{
    private int id;
    private double score;

    public Student(String name, int age, int id, double score) {
        super(name, age); //调用父类构造器
        this.id = id;
        this.score = score;
    }
    public String say() {  //体现super好处，方法复用
        return super.say() + " id=" + id + " score=" + score;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
