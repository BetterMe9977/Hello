package com.hspedu.generic;

public class Generic03 {
    public static void main(String[] args) {

        //注意：E 具体 的数据类型，该数据类型在定义Person对象的时候指定，即在编译期间，就确定E是什么类型
        Person<String> person = new Person<>("韩顺平教育");
        person.show();
        /*
         上面的Person类 表示： E --》 String
        class Person {
            String s; //E 表示s 的数据类型，该数据类型在定义Person对象的时候指定，即在编译期间，就确定E是什么类型
            public Person(String s) {
                this.s = s;
            }

            public String f() {
                return s;
            }
        }

         */

        Person<Integer> person1 = new Person<Integer>(100);
        person1.show();
        /*
        class Person {
            Integer s; //E 表示s 的数据类型，该数据类型在定义Person对象的时候指定，即在编译期间，就确定E是什么类型
            public Person(Integer s) {
                this.s = s;
            }

            public Integer f() {
                return s;
            }
        }

         */
    }

}

//泛型的作用： 可以在类声明时，通过一个标识表示类中某个属性的类型
//或者是某个方法的返回值的类型，或者是参数类型

class Person<E> {
    E s; //E 表示s 的数据类型，该数据类型在定义Person对象的时候指定，即在编译期间，就确定E是什么类型
    public Person(E s) {
        this.s = s;
    }

    public E f() {
        return s;
    }

    public void show() {
        System.out.println(s.getClass()); // 显示s的运行类型
    }
}
