package com.hspedu.homework_;

/**
 * @author lamT
 * @version 1.0
 */
public class Homework03 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.shout();
        Dog dog = new Dog();
        dog.shout();
    }
}

abstract class Animal {
    abstract public void shout();
}

class Cat extends Animal {

    @Override
    public void shout() {
        System.out.println("猫会喵喵叫");
    }
}
class Dog extends Animal {

    @Override
    public void shout() {
        System.out.println("狗会汪汪叫");
    }
}