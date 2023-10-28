package com.hspedu.innerclass;

public class MemberInnerClass01 {
    public static void main(String[] args) {
        Outer08 outer08 = new Outer08();
        outer08.t1();

        //外部其他类，使用成员内部类的三种方式
        //outer08.new Inner08();  相当于把new Inner08() 当作  outer08 的成员
       Outer08.Inner08 inner08 = outer08.new Inner08();

       //第二种方式，在外部类中，编写一个方法，可以返回 Inner08对象
        Outer08.Inner08 inner08Instance = outer08.getInner08Instance();
        inner08Instance.say();

    }
}

class Outer08 { //外部类
    private int n1 = 10;
    public String name = "张三";

    private void hi(){
        System.out.println("hi()方法...");

    }

    //1.成员内部类   是定义在外部类的成员位置上
    //2.可以添加任意修饰符，因为它就是一个成员
    public class Inner08{ //成员内部类

        private int n1 = 16;
        private double sal = 99.8;
        public void say() {
            //可以访问外部类的所有成员，包含私有的
            System.out.println("Outer08 的 n1 =" + n1 + " Outer08 的 name =" + name);
            hi();
            System.out.println("Outer08 的 n1 =" + Outer08.this.n1 );
        }
    }



    //方法返回一个Inner08实例
    public Inner08 getInner08Instance() {
        return new Inner08();
    }


    //写方法
    public void t1() {
        //使用成员内部类
        //创建成员内部类的对象，然后使用相关的方法
        Inner08 inner08 = new Inner08();
        inner08.say();
        System.out.println(inner08.sal);
    }

}