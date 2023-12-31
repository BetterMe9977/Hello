package com.hspedu.try_;

public class TryCatchExercise02 {
}

class Exception02 {
    public static int method() {
        int i = 1;
        try {
            i++; //i=2
            String[] names = new String[3];
            if (names[1].equals("tom")) { //NullPointerException
                System.out.println(names[1]);
            } else {
                names[3] = "hspedu";
            }
            return 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            return 2;
        } catch (NullPointerException e) { //捕获
            return ++i;  //i=3
        } finally { //必须执行
            return ++i; //i=4
        }
    }

    public static void main(String[] args) {
        System.out.println(method());
    }
}
