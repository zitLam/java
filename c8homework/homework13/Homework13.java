package com.hspedu.homework.homeworkc8.homework13;

public class Homework13 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("张飞", '男', 30, 5);
        t1.printInfo();  //调用方法：打印教师信息

        System.out.println("\n=============================");
        Person[] people = new Person[4]; //创建Person数组
        people[0] = new Student("张三", '男', 18, 20221033);
        people[1] = new Student("李四", '女', 19, 20221034);
        people[2] = new Teacher("王五", '男', 33, 12);
        people[3] = new Teacher("赵六", '女', 28, 5);
        System.out.println("打印排序前信息");
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getName());
        }
        new Person().bubble(people); //调用方法：按年龄从小到大排序
        System.out.println("打印排序后信息");
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getName());
        }

        System.out.println("\n=============================");
        for (int i = 0; i < people.length; i++) {
            people[i].state(people[i]);
        }
    }
}
