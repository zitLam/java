package com.hspedu.abstract_.template_;

import com.hspedu.abstract_.template_.AA;
import com.hspedu.abstract_.template_.BB;

public class TestTemplate {
    public static void main(String[] args) {
        AA aa = new AA();
        aa.calculateTime();

        BB bb = new BB();
        bb.calculateTime();

        Sub sub = new Sub();
        sub.calculateTime();
    }
}
