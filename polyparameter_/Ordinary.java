package com.hspedu.poly_.polyparameter_;

public class Ordinary extends  Employee {
    public Ordinary(String name, double salaryMonth) {
        super(name, salaryMonth);
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }

    public void work() {
        System.out.println(getName() + "正在工作。。");
    }
}
