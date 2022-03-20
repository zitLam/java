package com.hspedu.poly_.polyarr_;

public class Teacher extends Person {
    private double salaery;

    public Teacher(String name, int age, double salaery) {
        super(name, age);
        this.salaery = salaery;
    }

    @Override
    public String say() {
        return super.say() + " salary: " + salaery;
    }

    public void teach() {
        System.out.println("老师" +  getName() + "正在教书~~");
    }

    public double getSalaery() {
        return salaery;
    }

    public void setSalaery(double salaery) {
        this.salaery = salaery;
    }

}
