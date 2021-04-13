package com.xiaojian.javadesignpatterns.factoryPattern.simple;

/**
 * create_time : 21-4-13 下午3:27
 * author: lk
 * description： WhiteHuMan 白人
 */
public class WhiteHuMan implements HuMan {
    @Override
    public void getColor() {
        System.out.println("白色");
    }
    @Override
    public void talk() {
        System.out.println("白语");
    }
}
