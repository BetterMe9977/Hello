package com.hspedu.homework.homework13;

public class Homework13 {
    public static void main(String[] args) {

        //测试

        Student student1 = new Student("tom", '男', 18, "00023102");
        Student student2 = new Student("mary", '女', 19, "00023101");
        Teacher teacher1 = new Teacher("smith", '男', 30, 3);
        Teacher teacher2 = new Teacher("lucy", '女', 40, 13);

        student1.printInfo(); //封装
        System.out.println("-----------------------");
        teacher1.printInfo();


        // 定义多态数组，里面保存2个学生和2个老师，要求按照年龄从高到低排序
        Person[] persons = new Person[4];
        persons[0] = new Student("tom", '男', 18, "00023102");
        persons[1] = new Student("mary", '女', 19, "00023101");
        persons[2] = new Teacher("smith", '男', 30, 3);
        persons[3] = new Teacher("lucy", '女', 40, 13);


        //创建对象
        Homework13 homework13 = new Homework13();
        homework13.bubbleSort(persons);

        //输出排序后的数组
        System.out.println("-----------排序后的数组-----------");
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }

        //遍历数组，调用test方法
        System.out.println("========================");
        for (int i = 0; i < persons.length; i++) { //遍历数组
            homework13.test(persons[i]);
        }

    }

    //定义方法，形参为Person类型，功能：调用学生的study 或教师的 teach 方法
    //向下转型 和 类型判断
    public void test(Person p) { //Person接收，父类引用可以指向子类类型
        if(p instanceof Student) { //p的运行类型如果是Student
            ((Student)p).study();
        } else if (p instanceof Teacher) {
            ((Teacher)p).teach();
        } else {
            System.out.println("nothing");
        }
    }
    //方法，完成年龄从高到低排序
    public void bubbleSort(Person[] persons){
        Person temp = null;
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length -1 -i; j++) {
                //判断条件
                if(persons[j].getAge() < persons[j+1].getAge()) {
                    temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                }

            }

        }

    }
}
