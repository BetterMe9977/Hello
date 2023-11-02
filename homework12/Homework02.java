package com.hspedu.homework;

public class Homework02 {
    public static void main(String[] args) {

        //args.length = 0
        //这里发生的是 ArrayIndexOutOfBoundsException

        if (args[4].equals("john")) { //可能发生NullPointerException
            System.out.println("AA");
        } else {
            System.out.println("BB");
        }
        Object o = args[2];
        Integer i = (Integer)o; // 发生ClassCastException

        }


}
