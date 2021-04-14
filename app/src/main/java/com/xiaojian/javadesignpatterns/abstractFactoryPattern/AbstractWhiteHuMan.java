package com.xiaojian.javadesignpatterns.abstractFactoryPattern;

/**
 * create_time : 21-4-14 上午10:02
 * author: lk
 * description： AbstacrtWhiteHuMan 白色人种
 */
public abstract class AbstractWhiteHuMan implements HuMan {
    @Override
    public void getColor() {
        System.out.println("白色肤色");
    }

    @Override
    public void getTalk() {
        System.out.println("白色语言");
    }
}
