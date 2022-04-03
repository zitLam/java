package com.hspedu.exception_.instance_;

/**
 * @author lamT
 * @version 1.0
 */
public class ClassCastException_ {
    public static void main(String[] args) {
        //类型转换异常
        A b = new B();
        B b2 = (B)b;
        C c = (C)b;//这里抛出ClassCastException异常
    }
}

class A {

}
class B extends A { }
class C extends A { }