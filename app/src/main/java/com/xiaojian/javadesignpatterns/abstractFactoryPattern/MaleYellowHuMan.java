package com.xiaojian.javadesignpatterns.abstractFactoryPattern;

/**
 * create_time : 21-4-14 上午10:08
 * author: lk
 * description： FemaleWhiteHuMan 男性黄色人种
 */
public class MaleYellowHuMan extends AbstractYellowHuMan {
    @Override
    public void getSex() {
        System.out.println("男性黄色");
    }
}
