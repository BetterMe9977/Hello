package com.hspedu.abstract_;

public class BB extends Template{

    public void job() { //重写父类job方法


        long num = 0;
        for (long i = 0; i <= 80000; i++) {
            num *= i;
        }

    }
}
