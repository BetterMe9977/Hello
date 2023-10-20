package com.hspedu.poly_.polyarr_;

public class PolyArray {
    public static void main(String[] args) {

        //1个Person对象，2个student对象，2个teacher对象，统一放在数组中，并调用每个对象say方法

        Person[] persons = new Person[5];
        persons[0] = new Person("jack",20);
        persons[1] = new Student("mary",18,100);
        persons[2] = new Student("smith",19,30.1);
        persons[3] = new Teacher("scott",30,20000);
        persons[4] = new Teacher("king",50,25000);

        //循环遍历多态数组，调用say方法
        for (int i = 0; i < persons.length; i++) {
            //person[i] 编译类型是Person，运行类型根据实际情况由jvm来判断
            persons[i].say();
            System.out.println(persons[i].say()); //动态绑定机制

            //使用类型判断 + 向下转型
            if(persons[i] instanceof Student){ //判断persons[i] 运行类型是不是student
                Student student = (Student) persons[i]; //向下转型
                student.study();
                //可以写成((Student) persons[i]).study();
            } else if (persons[i] instanceof Teacher) {
                Teacher teacher = (Teacher) persons[i];
                teacher.teach();
            } else if (persons[i] instanceof Person) {

            } else {
                System.out.println("你的类型有误，请自己检查...");
            }


        }
    }
}
