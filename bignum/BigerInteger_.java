package com.hspedu.bignum;

import java.math.BigInteger;

public class BigerInteger_ {
    public static void main(String[] args) {

        //当编程中需要处理很大的数，long不够用
        //可以用BigInteger 的类来搞定
       // long l = 23777777888888889999999999999999l;
        //System.out.println("l=" + l);

        BigInteger bigInteger = new BigInteger("29993999999999999999999");
        BigInteger bigInteger2 = new BigInteger("10029993999999999999999999");
        System.out.println(bigInteger);

        // 在对BigInteger 进行加减乘除的时候，需要使用对应的方法，不能直接进行， +  -  *  /
        //可以创建一个 要操作的 BigInteger 然后进行相应操作
        BigInteger add = bigInteger.add(bigInteger2);
        System.out.println(add);
        BigInteger subtract = bigInteger.subtract(bigInteger2);
        System.out.println(subtract); //减
        BigInteger multiply = bigInteger.multiply(bigInteger2);
        System.out.println(multiply); //乘
        BigInteger divide = bigInteger.divide(bigInteger2);
        System.out.println(divide); //除
    }
}
