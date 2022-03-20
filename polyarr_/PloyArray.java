package com.hspedu.poly_.polyarr_;

public class PloyArray {
    public static void main(String[] args) {
        Person[] people = new Person[5];
        people[0] = new Person("Tom", 50);
        people[1] = new Student("Jack", 18, 95);
        people[2] = new Student("Smith", 19, 80);
        people[3] = new Teacher("Sam", 35, 9000);
        people[4] = new Teacher("Lisa", 33, 7800);
        for (int i = 0; i < people.length; i++) {
            //person[i] 编译类型是 Person ,运行类型是根据实际情况由 jvm 机判断。
            System.out.println(people[i].say());
            if (people[i] instanceof Student) {
                Student stu = (Student)people[i];
                stu.study();
                //可直接合成一条语句——>((Student)people[i]).study();
            } else if (people[i] instanceof Teacher) {
                Teacher teacher= (Teacher)people[i];
                teacher.teach();
                //可直接合成一条语句——>((Teacher)people[i]).teach();
            } else {
                System.out.println("身份信息有误");
            }

        }

    }
}
