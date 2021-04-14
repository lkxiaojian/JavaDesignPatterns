package com.xiaojian.javadesignpatterns.abstractFactoryPattern;

/**
 * create_time : 21-4-14 上午10:08
 * author: lk
 * description： MaleBlackHuMan 男性黑色人种
 */
public class MaleBlackHuMan extends AbstractYellowHuMan {
    @Override
    public void getSex() {
        System.out.println("男性黑色");
    }
}
