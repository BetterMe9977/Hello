package com.hspedu.poly_.polyparameter_;

public class PloyParameter {
    public static void main(String[] args) {
        Worker tom = new Worker("tom", 2500);
        Manager milan = new Manager("milan", 5000, 200000);
        PloyParameter ployParameter = new PloyParameter();
        ployParameter.showEmpAnnual(tom);
        ployParameter.showEmpAnnual(milan);

        ployParameter.testWork(tom);
        ployParameter.testWork(milan);
    }

    //获取任何员工对象的年工资，并在main方法中调用该方法
    public void showEmpAnnual(Employee e){
        System.out.println(e.getAnnual()); //动态绑定机制
    }

    //添加方法testWork ，如果是普通员工，调用work方法，如果是经理调用manage方法
    public void testWork(Employee e) {
        if(e instanceof Worker) {
            ((Worker)e).work(); //向下转型操作
        } else if(e instanceof Manager) {
            ((Manager)e).manage(); //向下转型操作
        } else {
            System.out.println("不做处理...");
        }

    }

}
