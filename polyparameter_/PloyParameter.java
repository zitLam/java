package com.hspedu.poly_.polyparameter_;

import com.hspedu.poly_.polyparameter_.Employee;
import com.sun.org.apache.xpath.internal.operations.Or;

public class PloyParameter {
    public static void main(String[] args) {
        Ordinary num1 = new Ordinary("张三", 8000);
        Manager m1 = new Manager("李四", 15000, 20000);
        PloyParameter ployParameter = new PloyParameter();
        ployParameter.showEmpAnnual(num1);
        ployParameter.showEmpAnnual(m1);
        System.out.println("=================");
        ployParameter.testWork(num1);
        ployParameter.testWork(m1);

    }

    public void showEmpAnnual(Employee e) {
        System.out.println(e.getName() + e.getAnnual());
    }

    public void testWork(Employee e) {
        if (e instanceof Ordinary) {
            ((Ordinary)e).work();
        } else if (e instanceof  Manager) {
            ((Manager) e).manage();
        } else {
            System.out.println("xxxxxx");
        }
    }
}


