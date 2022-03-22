package com.hspedu.object;

public class EqualsExercise01 {

    public static void main(String[] args) {
        Person person1 = new Person("jack", 18, '男');
        Person person2 = new Person("jack", 18, '女');

        System.out.println(person1.equals(person2));

    }
}
