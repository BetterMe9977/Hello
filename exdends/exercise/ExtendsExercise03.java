package com.hspedu.exdends.exercise;

public class ExtendsExercise03 {
    public static void main(String[] args) {
        PC pc = new PC("intel", 16, 500, "IBM");
        pc.printInfo();
        NotePad ibm = new NotePad("intel^", 16, 500, "IBM");
        ibm.printInfo();

    }
}
/*
编写Computer类，包含CPU，内存，硬盘等属性，getDetails方法用于返回Computer的详细信息
编写PC子类，继承Computer类，添加特有属性（品牌brand）
编写NotePad子类，继承Computer类，添加特有属性（colour）
编写Test类，在main方法中创建PC和NotePad对象，分别给对象中特有的属性赋值，
以及从Computer类继承的属性赋值，并使用方法并打印输出信息
 */