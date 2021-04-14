package com.xiaojian.javadesignpatterns.abstractFactoryPattern;

/**
 * create_time : 21-4-14 上午10:02
 * author: lk
 * description： AbstractBlackHuMan 黑色人种
 */
public abstract class AbstractBlackHuMan implements HuMan {
    @Override
    public void getColor() {
        System.out.println("黑色肤色");
    }

    @Override
    public void getTalk() {
        System.out.println("黑色语言");
    }
}
