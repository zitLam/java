package com.hspedu.homework.homeworkc8.homework13;

class Student extends Person {
    private int stu_id;

    public Student() {
    }

    public Student(String name, char sex, int age, int stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }

    public int getStu_id() {
        return stu_id;
    }

    public void study() {
        System.out.println(getName() + "承诺，我会好好学习");
    }

    @Override
    public String play() {
        return super.play() + "足球";
    }

}
