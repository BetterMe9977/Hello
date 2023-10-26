package com.hspedu.abstract_;

public class AbstractExercise01 {
    public static void main(String[] args) {
        Manager jack = new Manager("jack", 999, 50000);
        jack.setBonus(8000);
        jack.work();

        CommonEmploee tom = new CommonEmploee("tom", 888, 20000);
        tom.work();

    }
}
