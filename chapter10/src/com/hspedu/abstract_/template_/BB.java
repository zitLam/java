package com.hspedu.abstract_.template_;

public class BB {

    public void calculateTime(){
        //得到开始的时间
        long start = System.currentTimeMillis();
        job();
        //得到结束时间
        long end = System.currentTimeMillis();
        System.out.println("BB 执行时间=" + (end - start));
    }
    //计算任务： 1+..+ 10000
    public void job() {

        long num = 1;
        for (int i = 1; i < 80000; i++) {
            num *= i;
        }

    }
}
