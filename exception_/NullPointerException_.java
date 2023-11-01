package com.hspedu.exception_;

public class NullPointerException_ {
    public static void main(String[] args) {
        String name = null;
        //Method invocation 'length' will produce 'NullPointerException'
        System.out.println(name.length());
    }
}
