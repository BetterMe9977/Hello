package com.hspedu.object_;

public class EqualsExercise02 {
    public static void main(String[] args) {

        Person0 p1 = new Person0();
        p1.name = "hspedu";
        Person0 p2 = new Person0();
        p2.name = "hspedu";
        System.out.println(p1 == p2);
        System.out.println(p1.name == p2.name); //比较的是String类型
        System.out.println(p1.equals(p2));

        String s1 = new String("asdf");
        String s2 = new String("asdf");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
    }
}
class Person0 {
    public String name;
}
