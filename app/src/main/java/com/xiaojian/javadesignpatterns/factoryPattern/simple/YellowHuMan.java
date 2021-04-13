package com.xiaojian.javadesignpatterns.factoryPattern.simple;

/**
 * create_time : 21-4-13 下午3:27
 * author: lk
 * description： BlackHuMan 黄人
 */
public class YellowHuMan implements HuMan {
    @Override
    public void getColor() {
        System.out.println("黄色");
    }

    @Override
    public void talk() {
        System.out.println("黄语");
    }
}
