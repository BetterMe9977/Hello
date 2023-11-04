package com.hspedu.bignum;

import java.math.BigDecimal;

public class BigDecimal_ {
    public static void main(String[] args) {
        //当需要保存一个精度很高的数时，double 不够用
       // double d = 1999.22992299292992922992992929292929292939d; //1999.22992299293
       // System.out.println(d);

        BigDecimal bigDecimal = new BigDecimal("1999.22992299292992922992992929292929292939");
        BigDecimal bigDecimal2 = new BigDecimal("1.1");
        System.out.println(bigDecimal);

        //1. 如果对 BigDecimal 进行运算，比如加减乘除，需要使用对应的方法
        //2. 创建一个需要操作的 BigDecimal 然后 调用相应的方法即可

        System.out.println(bigDecimal.add(bigDecimal2));
        System.out.println(bigDecimal.subtract(bigDecimal2));
        System.out.println(bigDecimal.multiply(bigDecimal2));
        //可能抛出异常ArithmeticException，//without a rounding mode argument
        //System.out.println(bigDecimal.divide(bigDecimal2));
        //在调用divide方法时候指定精度  BigDecimal.ROUND_CEILING
        //如果有无限循环小数，就会保留分子的精度
        System.out.println(bigDecimal.divide(bigDecimal2,BigDecimal.ROUND_CEILING));
    }
}
