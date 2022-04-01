package com.hspedu.homework.homeworkc8.homework13;

public class Person {
    private String name;
    private char sex;
    private int age;

    public Person() {
    }

    public Person(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public String play() {
        return name + "爱玩";
    }

    public void printInfo() {
        System.out.println("姓名：" + name + "\n年龄：" + age + "\n性别：" + sex);
    }

    public void bubble(Person[] people) {
        //冒泡法按年龄排序
        Person temp = null;
        for (int i = 1; i < people.length; i++) {
            for (int j = 0; j < people.length - i; j++) {
                if (people[j].getAge() < people[j + 1].getAge()) {
                    temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                }
            }
        }
    }

    public void state(Person p) {
        if (p instanceof Teacher) {
            ((Teacher) p).teach();
        } else if (p instanceof Student) {
            ((Student) p).study();
        } else {
            System.out.println("null");
        }
    }
}
