package com.hspedu.homework;

public class Homework10 {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("smith", 30, "牙医", '男', 10000);
        Doctor doctor2 = new Doctor("smith", 30, "牙医", '男', 10000);
        System.out.println(doctor1.equals(doctor2));

    }
}
