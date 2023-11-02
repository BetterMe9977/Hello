package com.hspedu.wrapper;

public class WrapperExercise02 {
    public static void main(String[] args) {
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j); //比较是不是同一个对象

        //这里主要看范围，-128 ～ 127 就直接返回
        /*
        public static Integer valueOf(int i) {
        if (i >= IntegerCache.low && i <= IntegerCache.high)
            return IntegerCache.cache[i + (-IntegerCache.low)];
        return new Integer(i);
        }
         */

        Integer m = 1; //底层 Integer.valueOf(1);  - > 阅读源码
        Integer n = 1; //底层 Integer.valueOf(1);  - > 阅读源码
        System.out.println(m == n);

        //这里主要看范围，-128 ～ 127 就直接返回
        //否则 就new Integer(xx);
        Integer x = 128; //底层 Integer.valueOf(1);
        Integer y = 128; //底层 Integer.valueOf(1);
        System.out.println(x == y);

        }



}
