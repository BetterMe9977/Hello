package com.hspedu.enum_;

public class EnumDetail {
    public static void main(String[] args) {
       Music.CLASSICMUSIC.playing();
    }
}
class A {

}
//使用enum关键字后，就不能再继承其他类了，因为enum会隐式继承Enum，而java是但继承机制
//enum Season3 extends A {
//2.enum 实现的枚举类，仍然是一个类，所以还是可以实现接口的
interface IPlaying {
    public void playing();
}
enum Music implements IPlaying {
    CLASSICMUSIC
    ;

    @Override
    public void playing() {
        System.out.println("播放好听的音乐");

    }
}