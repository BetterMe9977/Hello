package com.hspedu.poly_.exercise_;



public class PolyExercise01 {
    public static void main(String[] args) {
        double d = 13.4;
        long I = (long) d;
        System.out.println(I);

        int in = 5;
       // boolean b = (boolean)in;
        //Inconvertible types; cannot cast 'int' to 'boolean'
        Object obj = "hello"; //向上转型
        String obStr = (String) obj; //向下转型
        System.out.println(obStr);


       // Object objPri = new Integer(5);

                    // String str = (String) objPri; //错误
                    //指向Integer的父类引用没转成String
                    //Casting 'objPri' to 'String' will produce
                    // 'ClassCastException' for any non-null value

        //Integer str1 = (Integer) objPri;   // 向下转型
    }
}
