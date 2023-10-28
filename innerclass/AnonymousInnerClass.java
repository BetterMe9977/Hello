package com.hspedu.innerclass;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}

class Outer04 { //外部类
    private int n1 = 10; //属性

    public void method() { //方法
        //基于接口的匿名内部类
        //1. 想使用IA ，并创建对象
        //2. 传统方式： 写一个类，实现该接口，并创建类
        //3. 需求：Tiger类只用一次，之后不再使用，定义Tiger造成浪费
        //4. 可以使用匿名内部类来简化
        //5. tiger的编译类型： IA
        //6. tiger的运行类型： 匿名内部类 XXXX =》 Outer04$1
        /*
        匿名内部类 看底层 会分配类名 Outer04$1
        class Outer04$1 implements IA {
            @Override
            public void cry() {
                System.out.println("老虎嗷嗷叫...");
            }
        }
         */
        //7. jdk底层在创建匿名内部类 Outer04$1 ，立即就创建了 Outer04$1 实例，并且把地址
        //   返回给tiger
        //8. 匿名内部类使用一次，就不能再使用
        IA tiger = new IA() {
            @Override
            public void cry() {
                System.out.println("老虎嗷嗷叫...");
            }
        };
        System.out.println("tiger的运行类型=" + tiger.getClass());
        tiger.cry();
        tiger.cry();
        tiger.cry();

        //IA tiger = new Tiger();
        //tiger.cry();

        //演示基于类的匿名内部类
        //1. father 的编译类型 Father
        //2. father 的运行类型 Outer04$1
        //3. 底层会创建匿名内部类
        /*
            class Outer04$2 extends Father{
                @Override
                public void test() {
                    System.out.println("匿名内部类重写了test方法");
                }
            }
         */
        //4. 同时也直接返回了 匿名内部类Outer04$2的对象
        //5. ("jack" )参数列表会传递给构造器

        Father father = new Father("jack") {
            @Override
            public void test() {
                System.out.println("匿名内部类重写了test方法");
            }
        };
        System.out.println("Father 对象的运行类型=" + father.getClass());
        father.test();

        //基于抽象类的匿名内部类
        //1. 编译类型Animal
        //2. 抽象方法要重写
        Animal animal = new Animal(){
            @Override
            void eat() {
                System.out.println("小狗吃骨头");
            }
        };
        animal.eat();
        System.out.println("animal 对象的运行类型=" + animal.getClass());
    }
}

interface IA { //接口
    public void cry();
}

//使用起来麻烦
class Tiger implements IA {
    @Override
    public void cry() {
        System.out.println("老虎嗷嗷叫");
    }
}
class Dog implements IA {
    @Override
    public void cry() {
        System.out.println("小狗汪汪叫");
    }
}

class Father { //类
    public Father(String name) { //构造器
        System.out.println("接收到name=" + name);

    }
    public void test() { //方法

    }
}
abstract class Animal{ //抽象类
    abstract void eat();
}

