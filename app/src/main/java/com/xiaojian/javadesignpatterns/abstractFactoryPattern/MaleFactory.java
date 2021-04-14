package com.xiaojian.javadesignpatterns.abstractFactoryPattern;

/**
 * create_time : 21-4-14 上午10:18
 * author: lk
 * description： MaleFactory 男性工厂
 */
public class MaleFactory  implements   HuManFactory{
    @Override
    public HuMan createYellowHuMan() {
        return new MaleYellowHuMan();
    }

    @Override
    public HuMan createWhiteHuMan() {
        return new MaleWhiteHuMan();
    }

    @Override
    public HuMan createBlackHuMan() {
        return new MaleBlackHuMan();
    }
}
