package com.hspedu;

public class Test_ {
    public static void main(String[] args) {

        BufferedReader_ bufferedReader_ = new BufferedReader_(new FileReader_());
        bufferedReader_.readFiles(10);
        System.out.println("=============调用一次==============");
        bufferedReader_.readFile();

        //通过 BufferedReader_ 多次读取字符串
        BufferedReader_ bufferedReader_2 = new BufferedReader_(new StringReader_());
        bufferedReader_2.readStrings(5);
    }
}
