package com.hspedu.final_;

public class Final01 {
    public static void main(String[] args) {

        E e = new E();
        //Cannot assign a value to final variable 'TAX_RATE'
       // e.TAX_RATE = 0.09;

    }
}
//如果我们要求A类不能被其他类继承
//可以使用final修饰 A 类
final class A{
}

//class B extends A {
        //Cannot inherit from final 'com.hspedu.final_.A'
//}

class C {
    //如果要求hi不能被子类重写
    //可以使用final修饰 hi方法
    public final void hi() {
    }
}

class D extends C {
   // hi()' cannot override 'hi()' in 'com.hspedu.final_.C';
   // overridden method is final
   // @Override
   // public void
   // hi() {
   //     super.hi();
  //  }
}

//当不希望类的某个属性的值被修改，可以用final修饰
class E {
    public final  double TAX_RATE = 0.08;
}

//不希望某个局部变量被修改，可以使用final修饰
class F {
    public void cry() {
        //这时，NUM 也称为 局部常量
        final double NUM = 0.01;
        //Cannot assign a value to final variable 'NUM'
        //NUM = 0.9;
        System.out.println("NUM = " + NUM);
    }
}