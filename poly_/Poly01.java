package com.hspedu.poly_;

public class Poly01 {
    public static void main(String[] args) {

        Master tom = new Master("汤姆");
        Dog dog = new Dog("大黄");
        Bone bone = new Bone("大棒骨");

        tom.feed(dog,bone);

        System.out.println("================================");
        Cat cat = new Cat("小花猫");
        Fish fish = new Fish("黄花鱼");
        tom.feed(cat,fish);

        //如果动物很多，食物很多
        //feed方法很多，不利于管理和维护
        //代码复用性不高，不利于维护
        //引出多态
        System.out.println("================================");
        //添加给小猪喂米饭
        Pig pig = new Pig("小花猪");
        Rice rice = new Rice("米饭");
        tom.feed(pig,rice);
    }




}
