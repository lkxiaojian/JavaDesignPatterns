package com.xiaojian.javadesignpatterns.abstractFactoryPattern;

/**
 * create_time : 21-4-14 上午10:08
 * author: lk
 * description： MaleWhiteHuMan 男性白色人种
 */
public class MaleWhiteHuMan extends AbstractYellowHuMan {
    @Override
    public void getSex() {
        System.out.println("男性白色");
    }
}
