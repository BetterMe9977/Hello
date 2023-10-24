package com.hspedu.homework;

// 扩展前一个练习的BankAccount类， 新类对每次存款和取款都收取1美元的手续费
public class CheckingAccount extends BankAccount{ //新的账号
    public CheckingAccount(double intialBalance) {
        super(intialBalance);
    }

    //属性


    @Override
    public void deposit(double amount) { //存款
        super.deposit(amount - 1); //利用父类的deposit
        // 1 块钱转入银行的账号
    }

    @Override
    public void withdraw(double amount) { //取款
        super.withdraw(amount + 1);
        // 1 块钱转入银行的账号
    }

}
