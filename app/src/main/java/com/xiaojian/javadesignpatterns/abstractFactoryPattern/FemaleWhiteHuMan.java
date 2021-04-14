package com.xiaojian.javadesignpatterns.abstractFactoryPattern;

/**
 * create_time : 21-4-14 上午10:08
 * author: lk
 * description： FemaleWhiteHuMan 女性白色人种
 */
public class FemaleWhiteHuMan extends AbstractWhiteHuMan {
    @Override
    public void getSex() {
        System.out.println("女性白色");
    }
}
