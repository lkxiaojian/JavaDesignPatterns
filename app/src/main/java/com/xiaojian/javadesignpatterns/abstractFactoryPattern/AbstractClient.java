package com.xiaojian.javadesignpatterns.abstractFactoryPattern;

/**
 * create_time : 21-4-14 上午10:20
 * author: lk
 * description： AbstractClient
 */
public class AbstractClient {
    public void createHuMan() {
        FemaleFactory femaleFactory = new FemaleFactory();
        femaleFactory.createBlackHuMan();
        femaleFactory.createWhiteHuMan();
        femaleFactory.createYellowHuMan();
        MaleFactory maleFactory = new MaleFactory();
        maleFactory.createBlackHuMan();
        maleFactory.createWhiteHuMan();
        maleFactory.createYellowHuMan();
    }
}
