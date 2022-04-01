package com.hspedu.abstract_.template_;

public class Sub extends Template {
    @Override
    public void job() {
        long sum = 0;
        for (long i = 0; i < 100000; i++) {
            sum += i;
        }
    }
}
