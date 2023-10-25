package com.hspedu.static_;

public class StaticExercise03 {
}

class Person0 {
    private int id;
    private static int total = 0;
    public static void setTotalPerson(int total) {
        //this.total = total; //错误，在static方法中，不可以使用this关键字
        //使用 类名.对象名
        Person0.total = total;
    }

    public Person0() { //构造器
        total++;
        id = total;
    }

    //编写一个方法，输出total的值
    public static void m() {
        System.out.println("total的值=" + total);
    }

}
class TestPerson0 {
    public static void main(String[] args) {
        Person0.setTotalPerson(3);
        new Person0();
        Person0.m();
    }
}