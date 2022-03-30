package com.hspedu.enum_;

/**
 * @author lamT
 * @version 1.0
 */
public class Enumeration03 {
}

//演示使用enum关键字来实现枚举类

enum Seasons {
    SPRING("春天", "温暖"), SUMMER("夏天", "炎热"),
    AUTUMN("秋天", "凉爽"), WINTER("冬天", "寒冷");
    private String name;
    private String desc;//描述

    Seasons(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
}
