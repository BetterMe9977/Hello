package com.hspedu.stringbuilder_;

public class StringVsStringBufferVsStringBuilder {
    public static void main(String[] args) {


        long startTime = 0l;
        long endTime = 0l;
        StringBuffer buffer = new StringBuffer("");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            buffer.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer 的执行时间： " + (endTime - startTime));


        StringBuilder builder = new StringBuilder("");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            builder.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder 的执行时间： " + (endTime - startTime));


        String text = "";
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            text = text + i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("String 的执行时间： " + (endTime - startTime));

    }


}
