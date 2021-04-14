package com.xiaojian.javadesignpatterns.abstractFactoryPattern;

/**
 * create_time : 21-4-14 上午10:08
 * author: lk
 * description： FemaleYellowHuMan 女性黄色人种
 */
public class FemaleYellowHuMan extends AbstractWhiteHuMan {
    @Override
    public void getSex() {
        System.out.println("女性黄色");
    }
}
