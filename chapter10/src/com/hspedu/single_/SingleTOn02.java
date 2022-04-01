package com.hspedu.single_;

/**
 * 演示懒汉式单例模式：存在线程安全问题
 */
public class SingleTOn02 {
    public static void main(String[] args) {
        Cat instance1 = Cat.getInstance();
        System.out.println(instance1);
        Cat instance2 = Cat.getInstance();
        System.out.println(instance2);

        System.out.println(instance1 == instance2);
    }
}

class Cat {
    private String name;
    private static Cat cat;

    private Cat(String name) {
        this.name = name;
    }

    public static Cat getInstance() {
        if (cat == null) {
           cat = new Cat("煤球"); //在方法内创建对象，不存在浪费资源的问题
        }
//        cat = new Cat("煤球");
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
