package com.xiaojian.javadesignpatterns.abstractFactoryPattern;

/**
 * create_time : 21-4-14 上午10:13
 * author: lk
 * description： FemaleFactory 女性工厂定义
 */
public class FemaleFactory implements HuManFactory {
    @Override
    public HuMan createYellowHuMan() {
        return new FemaleYellowHuMan();
    }

    @Override
    public HuMan createWhiteHuMan() {
        return new FemaleWhiteHuMan();
    }

    @Override
    public HuMan createBlackHuMan() {
        return new FemaleBlackHuMan();
    }
}
