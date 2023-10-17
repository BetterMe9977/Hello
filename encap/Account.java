package com.hspedu.encap;

//要求属性：姓名（长度2/3/4位），余额（大于20），密码（6位）
//如果不满足，给出提示信息，并给出默认值
//通过setXxx的方法给Account的属性赋值
//在AccountTest中测试

public class Account {
    //为了封装，将三个属性设置成private
    private String name;
    private double balance;
    private String pwd;

    //提供两个构造器

    public  Account(){

    }

    public Account(String name, double balance, String pwd) {
        this.setName(name);
        this.setBalance(balance);
        this.setPwd(pwd);

        }

    public String getName() {
        return name;
    }
//姓名（长度2/3/4位）
    public void setName(String name) {
        if(name.length() >=2 && name.length() <=4) {
        this.name = name;
     } else {
            System.out.println("姓名要起（长度2/3/4位），默认值无名");
            this.name = "无名";
        }
    }

    public double getBalance() {
        return balance;
    }
//余额（大于20）
    public void setBalance(double balance) {
        if (balance > 20) {
            this.balance = balance;
        } else {
            System.out.println("余额（大于20）默认为0");
        }
    }
        public String getPwd () {
            return pwd;
        }

//密码6位数
    public void setPwd(String pwd) {
        if (pwd.length() == 6) {
            this.pwd = pwd;
        } else {
            System.out.println("密码必须6位数默认密码000000");
            this.pwd = "000000";
        }
    }
    //显示账号信息
    public  void  showInfo(){
        //可以增加权限的校验
        System.out.println("账号信息name=" + name + "余额=" + balance + "密码=" + pwd);
        //    if() {
        //          System.out.println("账号信息name=" + name + "余额=" + balance + "密码=" + pwd);
        //     } else {
        //    System.out.println("你无权查看");
    }
}

