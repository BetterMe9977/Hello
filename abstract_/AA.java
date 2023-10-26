package com.hspedu.abstract_;

public class AA extends Template{

    //计算任务
    //1+ ..... + 10000

    @Override
    public void job() { // 实现父类的抽象方法job

        long num = 0;
        for (long i = 0; i < 800000; i++) {
            num += i;
        }

    }

}
