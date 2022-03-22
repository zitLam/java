package com.hspedu.object;

public class Person {
    private  String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //重写 Person 类 equals 方法：
    public boolean equals(Object anObject) {
        //判断如果比较的两个对象是同一个对象，则直接返回true.
        if (this == anObject) {
            return true;
        }
        //类型判断：是Person类才比较
        if (anObject instanceof Person){
           Person person = (Person)anObject;  //向下转型（调用子类所有成员）
           if(this.name.equals(person.name) && this.age == person.age
                   && this.gender == person.gender) {
               return true;
           }
           //或者return this.name.equals(person.name) && this.age == person.age
                    //&& this.gender == person.gender;
        } return false;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }


}
