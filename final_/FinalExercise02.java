package com.hspedu.final_;

public class FinalExercise02 {
    public static void main(String[] args) {

    }
}
class Something {
    public int addOne(final int x) {
        //++x; //Cannot assign a value to final variable 'x'
        return x + 1;

    }
}