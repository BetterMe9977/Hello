package com.hspedu.homework;

/*
扩展前一个练习的BankAccount类，
新类SavingAccount 每个月都有利息产生（earnMonthlyInterest 方法被调用），
并且有每月三次存款或取款免手续费，在earnMonthlyInterest 方法中重置交易计数
 */
public class SavingAccount extends BankAccount{
    private int count = 3;
    private double rate = 0.01; //利率

    public SavingAccount(double intialBalance) {
        super(intialBalance);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public void deposit(double amount) {
        //判断是否还可以免手续费
        if(count > 0) {
            super.deposit(amount);
        } else {
            super.deposit(amount - 1); //1块 转入银行
        }
        count--;
    }

    @Override
    public void withdraw(double amount) {
        //判断是否还可以免手续费
        if(count > 0) {
            super.withdraw(amount);
        } else {
            super.withdraw(amount + 1); //1块 转入银行
        }
        count--;
    }
    public void earnMonthlyInterest() { //每个月初，我们统计上个月的利息，同时将count=3
        count = 3;
        super.deposit(getBalance() * rate);

    }
}
