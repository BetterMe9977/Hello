package com.hspedu.interface_;



public class InterfaceExercise02 {
}

interface Aa{
    int x = 0; //等价public static final int x
}
class Bb {
    int x = 1; //普通属性
}

class C extends Bb implements Aa {
    public void pX() {
        //Reference to 'x' is ambiguous, both 'Bb.x' and 'Aa.x' match
        //System.out.println(x);
        //可以明确指定x
        //访问接口的x 使用A.x
        //访问父类的x 使用super.x
        System.out.println(Aa.x + " " + super.x);
    }

    public static void main(String[] args) {
        new C().pX();
    }
}
