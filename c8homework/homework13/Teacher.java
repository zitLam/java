package com.hspedu.homework.homeworkc8.homework13;

public class Teacher extends Person {
    private double work_age;

    public Teacher() {
    }

    public Teacher(String name, char sex, int age, double work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    public double getWork_age() {
        return work_age;
    }


    public void teach() {
        System.out.println(getName() + "承诺，我会认真教学");
    }

    @Override
    public String play() {
        return super.play() + "象棋";
    }

    @Override
    public void printInfo() {
        System.out.println("老师的信息如下：");
        super.printInfo();
        System.out.println("工龄： " + work_age);
        teach();
        System.out.println(play());
    }
}
