package com.xiaojian.javadesignpatterns.factoryPattern.simple;

/**
 * create_time : 21-4-13 下午3:27
 * author: lk
 * description： BlackHuMan 黑人
 */
public class BlackHuMan implements HuMan {
    @Override
    public void getColor() {
        System.out.println("黑色");
    }
    @Override
    public void talk() {
        System.out.println("黑语");
    }
}
