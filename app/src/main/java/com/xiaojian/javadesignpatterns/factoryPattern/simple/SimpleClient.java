package com.xiaojian.javadesignpatterns.factoryPattern.simple;

/**
 * create_time : 21-4-13 下午3:35
 * author: lk
 * description： SimpleClient 简单工厂
 */
public class SimpleClient {
    public void createHuMan(){
        BlackHuMan huMan = HuManFactory.createHuMan(BlackHuMan.class);
        huMan.getColor();
        huMan.talk();
    }
}
