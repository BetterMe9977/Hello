package com.hspedu.exdends.imorove;

import com.hspedu.exdends.Graduate;
import com.hspedu.exdends.Pupil;

public class Extends01 {
    public static void main(String[] args) {
        com.hspedu.exdends.Pupil pupil = new Pupil();
        pupil.name = "小明-";
        pupil.age = 11;
        pupil.testing();
        pupil.setScore(61);
        pupil.showInfo();

        System.out.println("============");
        com.hspedu.exdends.Graduate graduate = new Graduate();
        graduate.name = "默默^";
        graduate.age = 23;
        graduate.testing();
        graduate.setScore(100);
        graduate.showInfo();

    }
}
