package com.hspedu.homework_;

/**
 * @author lamT
 * @version 1.0
 */
public class Homework05 {
    public static void main(String[] args) {
        A a = new A();
        a.aa();
    }
}
class A {

    private String name = "good!";
    public void aa() {

        class B {
            private String name = "lam ";
            public void show() {
                System.out.println(name + A.this.name);
            }
        }
        new B().show();
    }

}
