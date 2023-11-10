package com.hspedu.homework;

import java.util.HashSet;
import java.util.Objects;

public class Homework06 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        Person0 p1 = new Person0(1001, "AA");
        Person0 p2 = new Person0(1001, "BB");
        set.add(p1);
        set.add(p2);
        p1.name = "CC";
        set.remove(p1);
        System.out.println(set);
        set.add(new Person0(1001,"CC"));
        System.out.println(set);
        set.add(new Person0(1001,"AA"));
        System.out.println(set);
    }
}
class Person0 {
    public String name;
    public int id;

    public Person0( int id,String name) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person0 person0 = (Person0) o;
        return id == person0.id && Objects.equals(name, person0.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "Person0{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}