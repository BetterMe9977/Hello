package com.hspedu.exdends.exercise;

//编写NotePad子类，继承Computer类，添加特有属性（colour）
public class NotePad extends Computer{
    private String colour;

    public NotePad(String cpu, int memory, int disk, String colour) {
        super(cpu, memory, disk);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public void printInfo() {
        System.out.println("NotePad信息=");
        // System.out.println(getCpu() + getMemory() +getMemory() );
        //调用父类getDetail方法 得到父类相关属性
        System.out.println(getDetail() + " colour=" + colour);
    }
}
