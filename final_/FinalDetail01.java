package com.hspedu.final_;

public class FinalDetail01 {
    public static void main(String[] args) {

        CC cc = new CC();//final是可以实例化对象

        new EE().cal(); //父类的final方法可以被子类继承，遵从继承机制
    }
}

class AA {
    /*
    1. 定义时，如public final double TAX_RATE = 0.08;
    2. 在构造器中，
    3. 在代码块中
     */
    public final double TAX_RATE = 0.08;//1.定义时赋值
    public final double TAX_RATE2;
    public final double TAX_RATE3;

    public AA() { //2.在构造器中赋值
        TAX_RATE2 = 1.1;
    }
    { //3. 在代码块中赋值
        TAX_RATE3 = 8.8;
    }
}

class BB {
    /*
    如果final修饰的属性是静态的，则初始化的位置只能是：
    1. 定义时  2. 在静态代码块中
    不能在构造器中赋值
     */

    public static final double TAX_RATE = 99.9;
    public static final double TAX_RATE2;

    //Variable 'TAX_RATE3' might not have been initialized
    //public static final double TAX_RATE3;//静态变量的初始化在类加载时就要赋值

    // public BB { //Cannot assign a value to final variable 'TAX_RATE3'
       // TAX_RATE3 = 8.8; //构造器在创建对象的时候才会被调用
    //}

    static {
        TAX_RATE2 = 3.3;
    }
}

//final类不能继承，但是可以实例化对象
final class CC {
}

//如果类不是final类，但是含有final方法，则该方法虽然不能重写，但是可以被继承

class DD {
    public final void cal() {
        System.out.println("cal()方法");
    }
}
class EE extends  DD {

}
