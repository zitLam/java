package com.hspedu.homework.homeworkc8.homework10;

import javax.print.Doc;

public class Doctor {
    private String name;
    private int age;
    private String job;
    private char gender;
    private double sal;

    public Doctor(String name, int age, String job, char gender, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public boolean equals(Object obj) {
        //判断两个比较对象是否相同
        if (this == obj) {
            return true;
        }
        //判断obj是否属于Doctor类型或者其子类型
        if (!(obj instanceof Doctor)){
            return false;
        }
        //向下转型，判断各属性是否相等
        Doctor doc = (Doctor) obj;
        return (this.name.equals(doc.name) && this.age == doc.age &&
                this.gender == doc.gender && this.job.equals(doc.job) && this.sal == doc.sal);
    }
}
