package com.hspedu.homework;

public class Homework07 {
    public static void main(String[] args) {

    }
}
class Test { //父类
    String name = "Rose";
    Test(){
        System.out.println("Test"); //1输出
    }
    Test(String name) {  //john
        this.name = name; //把父类的 name 修改成 john
    }
}
class Demo extends Test {
    String name = "jack";

    Demo() {
        super();
        System.out.println("Demo"); //2输出
    }

    Demo(String s) {
        super(s);
    }
    public void test() {
        System.out.println(super.name); //3 输出父类的Rose  //5 输出john
        System.out.println(this.name);  //4 输出子类的jack  //6 输出jack
    }
    public static void main(String[] args){
        //分析
        //1. new Demo()
        new Demo().test(); //匿名对象
        new Demo("john").test();//匿名 调用有参构造器
    }
}
